import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException; 
import java.text.SimpleDateFormat; 
import java.io.*; 
import java.lang.String;
import java.math.BigDecimal;
import java.util.Scanner; 
import java.util.Locale;
import java.util.Date;


public class CreateTable {
	public static void main(String[] args) throws IOException
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
		}

		System.out.println("MySQL JDBC Driver Registered!");
		Connection connection = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
			System.out.println("Connected");
			int create_status=createtable_module(connection);
			int insertemp_status=insertemptable_module(connection);
			int insertdept_status=insertdepttable_module(connection);
			int insertdeploc_status=insertdeploc_module(connection);
			int insertprojecton_status=insertproject_on_module(connection);
			int insertworkson_status=insertworks_on_module(connection);
			int insertdependent_status=insertdependent_module(connection);
			int alteraddreferences= altermodify_module(connection);
		}catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
		}
	}
	public static int createtable_module(Connection connection) throws IOException, SQLException {
		BufferedReader reader = new BufferedReader(new FileReader("createtable"));
		String line = null; //line read from csv 
		Scanner scanner = null; //scanned line 
		while((line = reader.readLine()) != null){ 
			scanner = new Scanner(line); 
			//create table
			while(scanner.hasNext()){ 
				String query=scanner.nextLine();
				System.out.println(query);
				PreparedStatement posted=connection.prepareStatement(query);
				int status=posted.executeUpdate();
				System.out.println(status);
			}
		}
		return 0;
	}
	public static int insertemptable_module(Connection connection) throws IOException, SQLException {
		String insertTableSQL="INSERT INTO EMPLOYEE"+"(Fname, Minit, Lname, Ssn, Bdate, Address, Sex,Salary,Super_ssn,Dno) VALUES"+"(?,?,?,?,?,?,?,?,?,?);";
		PreparedStatement preparedStatement = connection.prepareStatement(insertTableSQL); 
		BufferedReader reader = new BufferedReader(new FileReader("EMPLOYEE"));
		String line = null; //line read from csv   
		while((line = reader.readLine()) != null){ 
			String coloum[]=line.split(", "); 
			String Fname=coloum[0].replaceAll("'","");
			System.out.println(Fname);
			preparedStatement.setString(1,Fname);
			char minit=coloum[1].charAt(1);
			System.out.println(minit);
			preparedStatement.setObject(2, minit, java.sql.Types.CHAR); 
			String Lname=coloum[2].replaceAll("'", "");
			System.out.println(Lname);
			preparedStatement.setString(3, Lname); 
			String Ssn=coloum[3].replaceAll("'", "");
			System.out.println(Ssn);
			preparedStatement.setString(4, Ssn); 
			try { 
				//System.out.println(coloum[4]);
				String datecformat=coloum[4].replaceAll("'", "");
				//System.out.println(datecformat);
				DateFormat originalFormat = new SimpleDateFormat("DD-MMM-YYYY", Locale.ENGLISH);
				DateFormat targetFormat = new SimpleDateFormat("YYYY-MM-DD");
				Date date1 = originalFormat.parse(datecformat);
				String formattedDate = targetFormat.format(date1);
				Date finalDate=targetFormat.parse(formattedDate);
				java.sql.Date datvar = new java.sql.Date(finalDate.getTime()); 
				System.out.println(datvar);
				preparedStatement.setDate(5, datvar);
			} catch (ParseException e) { 
				e.printStackTrace(); 
				reader.close();
				return -1;
			}
			//String Bdate=coloum[5].replaceAll("'", "");
			//System.out.println(Bdate);
			//preparedStatement.setString(6,Bdate);
			String Address=coloum[5].replaceAll("'","");
			System.out.println(Address);
			preparedStatement.setString(6, Address); 
			String Sex=coloum[6].replaceAll("'", "");
			System.out.println(Sex);
			preparedStatement.setString(7, Sex);
			BigDecimal Salary = new BigDecimal(coloum[7]);
			preparedStatement.setBigDecimal(8, Salary);
			String Super_ssn= coloum[8].replaceAll("'", "");
			System.out.println(Super_ssn); 
			preparedStatement.setString(9, Super_ssn);
			int dno=Integer.parseInt(coloum[9]);
			System.out.println(dno);
			preparedStatement.setInt(10, dno);

			System.out.println(insertTableSQL);
			int status=preparedStatement.executeUpdate();
			System.out.println(status);
			//return 0;
		}
		System.out.println("Successful employee insertion");
		reader.close();
		return 0;
	}
	public static int insertdepttable_module(Connection connection) throws IOException, SQLException {
		String insertdepttable="INSERT INTO DEPARTMENT (Dname,Dnumber,Mgr_ssn,Mgr_start_date) VALUES"+"(?,?,?,?);";
		PreparedStatement preparedStatement = connection.prepareStatement(insertdepttable); 
		BufferedReader reader = new BufferedReader(new FileReader("DEPARTMENT"));
		String line=null;
		try {
			while((line = reader.readLine()) != null){ 
				String coloum[]=line.split(", ");
				String Dname=coloum[0].replaceAll("'", "");
				System.out.println(Dname);
				preparedStatement.setString(1, Dname);
				int Dnumber=Integer.parseInt(coloum[1].replaceAll("'", ""));
				System.out.println(Dnumber);
				preparedStatement.setInt(2,Dnumber );
				String Mgr_ssn=coloum[2].replaceAll("'", "");
				System.out.println(Mgr_ssn);
				preparedStatement.setString(3, Mgr_ssn);
				String Mgrssn_date=coloum[3].replaceAll("'", "");
				//System.out.println(datecformat);
				DateFormat originalFormat = new SimpleDateFormat("DD-MMM-YYYY", Locale.ENGLISH);
				DateFormat targetFormat = new SimpleDateFormat("YYYY-MM-DD");
				Date date1 = originalFormat.parse(Mgrssn_date);
				String formattedDate = targetFormat.format(date1);
				Date finalDate=targetFormat.parse(formattedDate);
				java.sql.Date datvar = new java.sql.Date(finalDate.getTime()); 
				System.out.println(datvar);
				preparedStatement.setDate(4, datvar);
				int status=preparedStatement.executeUpdate();
				System.out.println(status);
			}}
		catch(ParseException e){
			e.printStackTrace();
			reader.close();
			return -1;
		}
		reader.close();
		System.out.println("Successful department insertion");
		return 0;	
	}

	public static int insertdeploc_module(Connection connection) throws IOException, SQLException {
		String insertTableSQL="INSERT INTO DEPT_LOCATIONS"+"(Dnumber, Dlocation) VALUES"+"(?,?);";
		PreparedStatement preparedStatement = connection.prepareStatement(insertTableSQL); 
		BufferedReader reader = new BufferedReader(new FileReader("DEPT_LOCATIONS"));
		String line = null; 
		try {
			while((line = reader.readLine()) != null){ 
				String coloum[]=line.split(", "); 

				int Dnumber=Integer.parseInt(coloum[0]);
				System.out.println(Dnumber);
				preparedStatement.setInt(1,Dnumber);

				String Dlocation=coloum[1].replaceAll(" '","");
				System.out.println(Dlocation);
				preparedStatement.setString(2,Dlocation);

				System.out.println(insertTableSQL);
				int status=preparedStatement.executeUpdate();
				System.out.println(status);
				//return 0;
			}
		}
		catch(Exception e){
			e.printStackTrace();
			reader.close();
			return -1;
		}
		reader.close();
		System.out.println("Successful dept_loc insertion");
		return 0;
	}


	public static int insertworks_on_module(Connection connection) throws IOException, SQLException {
		String insertTableSQL="INSERT INTO WORKS_ON "+"(Essn,Pno,Hours) VALUES"+"(?,?,?);";
		PreparedStatement preparedStatement = connection.prepareStatement(insertTableSQL); 
		BufferedReader reader = new BufferedReader(new FileReader("WORKS_ON"));
		try {
			String line = null; 
			while((line = reader.readLine()) != null){ 
				String coloum[]=line.split(","); 

				String Essn=coloum[0].replaceAll("'","");
				System.out.println(Essn);
				preparedStatement.setString(1, Essn); 

				int Pno=Integer.parseInt(coloum[1].replaceAll(" ", ""));
				System.out.println(Pno);
				preparedStatement.setInt(2,Pno);

				BigDecimal Hours = new BigDecimal(coloum[2].replaceAll(" ", ""));
				System.out.println(Hours);
				preparedStatement.setBigDecimal(3, Hours);

				System.out.println(insertTableSQL);
				int status=preparedStatement.executeUpdate();
				System.out.println(status);
			}}
		catch(Exception e) {
			System.out.println(e);
			reader.close();
			return -1;
		}
		reader.close();
		System.out.println("Successful works_on insertion");
		return 0;
	}

	public static int insertproject_on_module(Connection connection) throws IOException, SQLException {
		String insertTableSQL="INSERT INTO PROJECT "+"(Pname,Pnumber,Plocation, Dnum)  VALUES"+"(?,?,?,?);";
		PreparedStatement preparedStatement = connection.prepareStatement(insertTableSQL); 
		BufferedReader reader = new BufferedReader(new FileReader("PROJECT"));
		try{
			String line = null; 
			while((line = reader.readLine()) != null){ 
				String coloum[]=line.split(", "); 

				String Pname=coloum[0].replaceAll("'","");
				System.out.println(Pname);
				preparedStatement.setString(1, Pname); 

				int Pno=Integer.parseInt(coloum[1].replaceAll(" ", ""));
				System.out.println(Pno);
				preparedStatement.setInt(2,Pno);

				String Ploc=coloum[2].replaceAll("'","");
				System.out.println(Ploc);
				preparedStatement.setString(3, Ploc);
				System.out.println(Pname+Pno+Ploc);
				int Dnum=Integer.parseInt(coloum[3]);
				System.out.println(Dnum);
				preparedStatement.setInt(4, Dnum);

				System.out.println(insertTableSQL);
				int status=preparedStatement.executeUpdate();
				System.out.println(status);
			}}
		catch(Exception e)
		{
			System.out.println(e);
			reader.close();
			return -1;
		}
		reader.close();
		System.out.println("Successful project insertion");
		return 0;
	}

	public static int insertdependent_module(Connection connection) throws IOException, SQLException {
		String insertTableSQL="INSERT INTO DEPENDENT "+"(Essn,Dependent_name,Sex,Bdate,Relationship)  VALUES"+"(?,?,?,?,?);";
		PreparedStatement preparedStatement = connection.prepareStatement(insertTableSQL); 
		BufferedReader reader = new BufferedReader(new FileReader("DEPENDENT"));
		try{
			String line = null; 
			while((line = reader.readLine()) != null){ 
				String coloum[]=line.split(", "); 

				String Essn=coloum[0].replaceAll("'", "");
				System.out.println(Essn);
				preparedStatement.setString(1, Essn); 

				String Dependent_name=coloum[1].replaceAll("'", "");
				System.out.println(Dependent_name);
				preparedStatement.setString(2,Dependent_name);

				String Sex=coloum[2].replaceAll("'", "");
				System.out.println(Sex);
				preparedStatement.setString(3, Sex);

				String Bdate=coloum[3].replaceAll("'", "");
				DateFormat originalFormat = new SimpleDateFormat("DD-MMM-YYYY", Locale.ENGLISH);
				DateFormat targetFormat = new SimpleDateFormat("YYYY-MM-DD");
				Date date1 = originalFormat.parse(Bdate);
				String formattedDate = targetFormat.format(date1);
				Date finalDate=targetFormat.parse(formattedDate);
				java.sql.Date datvar = new java.sql.Date(finalDate.getTime()); 
				System.out.println(datvar);
				preparedStatement.setDate(4, datvar);

				String relationship=coloum[4].replaceAll("'", "");
				System.out.println(relationship);
				preparedStatement.setString(5, relationship);
				int status=preparedStatement.executeUpdate();
				System.out.println(status);
			}}
		catch(Exception e)
		{
			System.out.println(e);
			reader.close();
			return -1;
		}
		reader.close();
		System.out.println("Successful dependent insertion");
		return 0;
	}
	public static int altermodify_module(Connection connection) throws IOException, SQLException {
		BufferedReader reader = new BufferedReader(new FileReader("AlterTable"));
		String line = null; //line read from csv 
		Scanner scanner = null;
		try { 
			while((line = reader.readLine()) != null){ 
				scanner = new Scanner(line); 
				//create table
				while(scanner.hasNext()){ 
					String query=scanner.nextLine();
					System.out.println(query);
					PreparedStatement posted=connection.prepareStatement(query);
					int status=posted.executeUpdate();
					System.out.println(status);
				}}}
		catch(Exception e)
		{
			System.out.println(e);
			reader.close();
			return -1;
		}
		reader.close();
		System.out.println("Successful alter table");
		return 0;
	}

}




