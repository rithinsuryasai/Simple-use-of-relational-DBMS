# Simple-use-of-relational-DBMS
---


#### mysql> SELECT * FROM EMPLOYEE; 

```
+-----------+-------+-----------+-----------+------------+--------------------------------+------+----------+-----------+-----+
| Fname     | Minit | Lname     | Ssn       | Bdate      | Address                        | Sex  | Salary   | Super_ssn | Dno |
+-----------+-------+-----------+-----------+------------+--------------------------------+------+----------+-----------+-----+
| Alex      | C     | Yu        | 001614905 | 1979-12-30 | 626 Mary St,Dallas,TX          | M    | 50000.00 | 444444400 |   6 |
| Lisa      | G     | House     | 101248268 | 1974-12-29 | 12 Maple St,Austin,TX          | F    | 85000.00 | null      |   7 |
| Sunil     | D     | Gupta     | 110110110 | 2000-12-31 | 4312 Bowen Rd,Arlington,TX     | M    | 80000.00 | 111111100 |   3 |
| Jared     | D     | James     | 111111100 | 1965-12-26 | 123 Peachtr,Atlanta,GA         | M    | 85000.00 | null      |   6 |
| Jon       | C     | Jones     | 111111101 | 1967-01-01 | 111 Allgood,Atlanta,GA         | M    | 45000.00 | 111111100 |   6 |
| Justin    | u     | Mark      | 111111102 | 1965-12-26 | 2342 May,Atlanta,GA            | M    | 40000.00 | 111111100 |   6 |
| Brad      | C     | Knight    | 111111103 | 1967-12-31 | 176 Main St.,Atlanta,GA        | M    | 44000.00 | 111111100 |   6 |
| Cameron   | D     | Thirteen  | 111422203 | 2000-12-31 | 22 Univ Blvd,Arlington,TX      | F    | 80000.00 | 987987987 |   4 |
| Juan      | G     | Linda     | 112244668 | 1964-12-27 | 1210 Apple St,Austin,TX        | F    | 55000.00 | null      |   9 |
| John      | B     | Smith     | 123456789 | 1954-12-26 | 731 Fondren,Houston,TX         | M    | 30000.00 | 333445555 |   5 |
| Debra     | T     | Hall      | 202843824 | 1982-12-26 | 45 NY St,Rochester,NY          | F    | 30000.00 | 555555501 |   6 |
| Richard   | T     | Koelbel   | 214370999 | 1975-12-28 | 50 Elk St,Chicago,IL           | M    | 85000.00 | 999999999 |   4 |
| Evan      | E     | Wallis    | 222222200 | 1957-12-29 | 134 Pelham,Milwaukee,WI        | M    | 92000.00 | null      |   7 |
| Josh      | U     | Zell      | 222222201 | 1953-12-27 | 266 McGrady,Milwaukee,WI       | M    | 56000.00 | 222222200 |   7 |
| Andy      | C     | Vile      | 222222202 | 1943-12-26 | 1967 Jordan,Milwaukee,WI       | M    | 53000.00 | 222222200 |   7 |
| Tom       | G     | Brand     | 222222203 | 1965-12-26 | 112 Third St,Milwaukee,WI      | M    | 62500.00 | 222222200 |   7 |
| Jenny     | F     | Vos       | 222222204 | 1967-01-01 | 263 Mayberry,Milwaukee,WI      | F    | 61000.00 | 222222201 |   7 |
| Chris     | A     | Carter    | 222222205 | 1959-12-27 | 565 Jordan,Milwaukee,WI        | F    | 43000.00 | 222222201 |   7 |
| John      | T     | Ed        | 222333444 | 1980-12-28 | 4505 West St,Rochester,NY      | M    | 30000.00 | 555555501 |   6 |
| Jennifer  | A     | Joy       | 223344667 | 1975-12-28 | 1204 Main St,Miami,FL          | F    | 45000.00 | 666666613 |   8 |
| willie    | D     | Mary      | 234234234 | 1961-01-01 | 101 South St,Arlington,TX      | F    | 12000.00 | 112244668 |   9 |
| Christina | S     | Hisel     | 241625699 | 1985-12-29 | 37 Church Row,Rochester,NY     | F    | 45000.00 | 123456789 |   6 |
| Erin      | A     | Maxfield  | 242535609 | 1970-12-27 | 123 Copper St,Arlington,TX     | F    | 72000.00 | 555555500 |   8 |
| Wilson    | A     | Holmes    | 242916639 | 1970-12-27 | 21 South Co,Arlington,TX       | M    | 72500.00 | 555555500 |   4 |
| Jake      | D     | Sheen     | 245239264 | 1953-12-27 | 20 North Co,Arlington,TX       | M    | 52000.00 | 112244668 |   6 |
| Megan     | G     | Jones     | 254937381 | 1961-01-01 | 528 Stone CT,Chicago,IL        | F    | 62000.00 | 666666600 |   8 |
| Jisha     | A     | Carpenter | 292740167 | 1984-12-30 | 194 Beachdr,Miami,FL           | F    | 15000.00 | 666666613 |   1 |
| Kim       | C     | Grace     | 333333300 | 1969-12-28 | 667 Mills Ave,Sacramento,CA    | F    | 79000.00 | null      |   6 |
| Jeff      | H     | Chase     | 333333301 | 1969-12-28 | 15 Bradbury,Sacramento,CA      | M    | 44000.00 | 333333300 |   6 |
| Frank     | T     | Wong      | 333445555 | 1944-12-31 | 638 Voss,Houston,TX            | M    | 40000.00 | 888665555 |   5 |
| Jose      | H     | Barbara   | 343434344 | 1954-12-26 | 905 East St,Kleen,TX           | F    | 35000.00 | 444444400 |   6 |
| Leonard   | H     | Moody     | 349273344 | 1972-12-31 | 908 Greek Row,Austin,TX        | M    | 45000.00 | 444444400 |   7 |
| Percy     | M     | Liang     | 398172999 | 1990-12-30 | 14 Maple St,Austin,TX          | M    | 55000.00 | null      |   9 |
| Cindy     | K     | Burklow   | 432765098 | 1984-01-01 | 2015 Neil Ave,Miami,FL         | F    | 45000.00 | 444444402 |   6 |
| Gregory   | G     | Laurie    | 444212096 | 1968-12-29 | 78 Tree Cir,Houston,TX         | M    | 90000.00 | 444444400 |   7 |
| Kim       | G     | Ted       | 444222666 | 1967-12-31 | 3648 Tree Cir,Austin,TX        | M    | 50000.00 | 999999999 |   8 |
| Alex      | D     | Freed     | 444444400 | 1950-01-01 | 4333 Pillsbury,Milwaukee,WI    | M    | 89000.00 | null      |   7 |
| Bonnie    | S     | Bays      | 444444401 | 1956-01-01 | 111 Hollow,Milwaukee,WI        | F    | 70000.00 | 444444400 |   7 |
| Alec      | C     | Best      | 444444402 | 1965-12-26 | 233 Solid,Milwaukee,WI         | M    | 60000.00 | 444444400 |   7 |
| Sam       | S     | Snedden   | 444444403 | 1976-12-26 | 97 Windy St,Milwaukee,WI       | M    | 48000.00 | 444444400 |   7 |
| Joyce     | A     | English   | 453453453 | 1961-12-31 | 5631 Rice Oak,Houston,TX       | F    | 25000.00 | 333445555 |   5 |
| John      | C     | James     | 555555500 | 1974-12-29 | 766 Bloomington,Sacramento,CA  | M    | 81000.00 | null      |   8 |
| Nandita   | K     | Ball      | 555555501 | 1968-12-29 | 222 Howard,Sacramento,CA       | M    | 62000.00 | 555555500 |   6 |
| Andrea    | M     | Sondrini  | 614370310 | 1995-12-31 | 1450 Worthington St,Houston,TX | F    | 65000.00 | 444444401 |   5 |
| Michael   | A     | Morgan    | 636669233 | 1984-01-01 | 26 Sunset Blvd,Miami,FL        | M    | 73500.00 | 666666612 |   5 |
| Bob       | B     | Bender    | 666666600 | 1967-12-31 | 8794 Garfield,Chicago,IL       | M    | 96000.00 | null      |   8 |
| Jill      | J     | Jarvis    | 666666601 | 1965-12-26 | 6234 Lincoln,Chicago,IL        | F    | 36000.00 | 666666600 |   8 |
| Kate      | W     | King      | 666666602 | 1965-12-26 | 1976 Boone Trace,Chicago,IL    | F    | 44000.00 | 666666600 |   8 |
| Lyle      | G     | Leslie    | 666666603 | 1962-12-30 | 417 Hancock Ave,Chicago,IL     | M    | 41000.00 | 666666601 |   8 |
| Billie    | J     | King      | 666666604 | 1959-12-27 | 556 Washington,Chicago,IL      | F    | 38000.00 | 666666603 |   8 |
| Jon       | A     | Kramer    | 666666605 | 1963-12-29 | 1988 Windy Creek,Seattle,WA    | M    | 41500.00 | 666666603 |   8 |
| Ray       | H     | King      | 666666606 | 1948-12-26 | 213 Delk Road,Seattle,WA       | M    | 44500.00 | 666666604 |   8 |
| Gerald    | D     | Small     | 666666607 | 1961-12-31 | 122 Ball Street,Dallas,TX      | M    | 29000.00 | 666666602 |   8 |
| Arnold    | A     | Head      | 666666608 | 1967-01-01 | 233 Spring St,Dallas,TX        | M    | 33000.00 | 666666602 |   8 |
| Helga     | C     | Pataki    | 666666609 | 1968-12-29 | 101 Holyoke St,Dallas,TX       | F    | 32000.00 | 666666602 |   8 |
| Naveen    | B     | Drew      | 666666610 | 1969-12-28 | 198 Elm St,Philadelphia,PA     | M    | 34000.00 | 666666607 |   8 |
| Carl      | E     | Reedy     | 666666611 | 1976-12-26 | 213 Ball St,Philadelphia,PA    | M    | 32000.00 | 666666610 |   8 |
| Sammy     | G     | Hall      | 666666612 | 1969-12-28 | 433 Main Street,Miami,FL       | M    | 37000.00 | 666666611 |   8 |
| Red       | A     | Bacher    | 666666613 | 1979-12-30 | 196 Elm Street,Miami,FL        | M    | 33500.00 | 666666612 |   8 |
| Ramesh    | K     | Narayan   | 666884444 | 1951-12-30 | 971 Fire Oak,Humble,TX         | M    | 38000.00 | 333445555 |   5 |
| Penny     | G     | Wolowitz  | 673466642 | 1973-12-30 | 42 South Blvd,Miami,FL         | F    | 17000.00 | 222333444 |   6 |
| Sheldon   | C     | Cucuou    | 849934919 | 1973-12-30 | 11 Hollywood Blvd,Dallas,TX    | M    | 35500.00 | 888665555 |   8 |
| James     | E     | Jordan    | 888665151 | 1926-12-26 | 450 Stone,Houston,TX           | M    | 55000.00 | null      |   1 |
| Shilpa    | U     | Miller    | 888665555 | 1978-01-01 | 13 Fifth St,Seattle,WA         | M    | 75000.00 | 888665555 |   1 |
| James     | U     | Miller    | 906218888 | 1978-01-01 | 13 Fifth St,Seattle,WA         | M    | 75000.00 | 999999999 |   5 |
| Joseph    | K     | Kirkish   | 913323708 | 1995-12-31 | 22 UT Blvd,Austin,TX           | M    | 95000.00 | null      |   7 |
| Zach      | A     | Geller    | 913353347 | 1989-12-31 | 333 PikeWay,Seattle,WA         | M    | 55000.00 | 444444403 |   6 |
| Jennifer  | S     | Wallace   | 987654321 | 1930-12-28 | 291 Berry,Bellaire,TX          | F    | 43000.00 | 888665555 |   4 |
| Ahmad     | V     | Jabbar    | 987987987 | 1958-12-28 | 980 Dallas,Houston,TX          | M    | 25000.00 | 987654321 |   4 |
| Alicia    | J     | Zelaya    | 999887777 | 1957-12-29 | 3321 Castle,Spring,TX          | F    | 25000.00 | 987654321 |   4 |
| Roy       | C     | Lewallen  | 999999999 | 1976-12-26 | 14 Wynncrest Street,Dallas,TX  | M    | 75500.00 | 666666600 |   8 |
+-----------+-------+-----------+-----------+------------+--------------------------------+------+----------+-----------+-----+
71 rows in set (0.00 sec)
```
#### mysql> SELECT * FROM DEPARTMENT;
```
+----------------+---------+-----------+----------------+
| Dname          | Dnumber | Mgr_ssn   | Mgr_start_date |
+----------------+---------+-----------+----------------+
| Headquarters   |       1 | 888665555 | 1970-12-27     |
| Networking     |       3 | 110110110 | 2008-12-28     |
| Administration |       4 | 987654321 | 1984-12-30     |
| Research       |       5 | 333445555 | 1978-01-01     |
| Software       |       6 | 111111100 | 1998-12-27     |
| Hardware       |       7 | 444444400 | 1997-12-28     |
| Sales          |       8 | 555555500 | 1996-12-29     |
| HR             |       9 | 112244668 | 1989-01-01     |
| QA             |      11 | 913323708 | 2009-12-27     |
+----------------+---------+-----------+----------------+
9 rows in set (0.00 sec)
```
#### mysql> SELECT * FROM dept_locations;

```
+---------+-------------+
| Dnumber | Dlocation   |
+---------+-------------+
|       1 | Houston     |
|       4 | Stafford    |
|       5 | Bellaire    |
|       5 | Houston     |
|       5 | Sugarland   |
|       6 | Atlanta     |
|       6 | Sacramento  |
|       7 | Milwaukee   |
|       8 | Chicago     |
|       8 | Dallas      |
|       8 | Miami       |
|       8 | Philadephia |
|       8 | Seattle     |
|       9 | Arlington   |
|      11 | Austin      |
+---------+-------------+
15 rows in set (0.00 sec)
```
#### mysql> SELECT * FROM project;
```
+------------------+---------+------------+------+
| Pname            | Pnumber | Plocation  | Dnum |
+------------------+---------+------------+------+
| EntityAnnot      |       4 | Houston    |    5 |
| Analysis         |       5 | Sacramento |    6 |
| EventManagement  |       6 | Sacramento |    6 |
| FoodDistribution |       7 | Sacramento |    6 |
| Computerization  |      10 | Stafford   |    4 |
| ConfigMgmt       |      11 | Atlanta    |    6 |
| DataMining       |      13 | Sacramento |    6 |
| Reorganization   |      20 | Houston    |    1 |
| SearchEngine     |      22 | Arlington  |    6 |
| MotherBoard      |      29 | Milwaukee  |    7 |
| Benefits         |      30 | Stafford   |    4 |
| OperatingSystem  |      61 | Sacramento |    6 |
| DatabaseSystems  |      62 | Atlanta    |    6 |
| Middleware       |      63 | Atlanta    |    6 |
| Advertizing      |      70 | Arlington  |    9 |
| InkjetPrinters   |      91 | Milwaukee  |    7 |
| LaserPrinters    |      92 | Milwaukee  |    7 |
| HumanResource    |      95 | Arlington  |    9 |
+------------------+---------+------------+------+
18 rows in set (0.00 sec)
```
#### mysql> SELECT * FROM works_on;
```
+-----------+-----+-------+
| Essn      | Pno | Hours |
+-----------+-----+-------+
| 001614905 |  13 |  18.0 |
| 101248268 |  29 |  10.0 |
| 111111100 |  61 |  40.0 |
| 111111101 |  61 |  40.0 |
| 111111102 |  61 |  40.0 |
| 111111103 |  61 |  40.0 |
| 111422203 |   4 |  45.0 |
| 111422203 |   6 |   5.0 |
| 112244668 |  95 |  40.0 |
| 123456789 |   5 |  32.5 |
| 123456789 |   6 |   7.5 |
| 202843824 |  11 |  20.0 |
| 214370999 |   5 |   4.0 |
| 214370999 |  10 |  35.0 |
| 222222200 |  62 |  40.0 |
| 222222201 |  62 |  48.0 |
| 222222202 |  62 |  40.0 |
| 222222203 |  62 |  40.0 |
| 222222204 |  62 |  40.0 |
| 222222205 |  62 |  40.0 |
| 222333444 |  91 |  10.0 |
| 223344667 |  63 |  20.0 |
| 234234234 |  95 |  35.0 |
| 241625699 |  61 |   4.0 |
| 242535609 |  62 |  20.0 |
| 242535609 |  70 |  20.0 |
| 242916639 |   4 |   5.0 |
| 242916639 |   7 |  10.0 |
| 242916639 |  11 |  20.0 |
| 245239264 |   5 |   5.0 |
| 245239264 |  10 |  25.0 |
| 245239264 |  11 |  25.0 |
| 254937381 |  70 |  40.0 |
| 292740167 |   5 |  25.0 |
| 333333300 |  63 |  40.0 |
| 333333301 |  63 |  46.0 |
| 333445555 |   7 |  10.0 |
| 333445555 |  10 |  10.0 |
| 333445555 |  20 |  10.0 |
| 343434344 |  63 |  40.0 |
| 349273344 |   6 |  10.0 |
| 349273344 |  29 |  15.0 |
| 398172999 |   7 |  10.0 |
| 398172999 |  70 |  10.0 |
| 432765098 |  63 |  25.0 |
| 444212096 |  63 |  25.0 |
| 444222666 |  62 |  25.0 |
| 444444400 |  91 |  40.0 |
| 444444401 |  91 |  40.0 |
| 444444402 |  91 |  40.0 |
| 444444403 |  91 |  40.0 |
| 453453453 |   5 |  20.0 |
| 453453453 |   6 |  20.0 |
| 555555500 |  92 |  40.0 |
| 555555501 |  92 |  44.0 |
| 614370310 |   3 |  45.0 |
| 636669233 |   4 |  11.0 |
| 666666601 |  91 |  40.0 |
| 666666603 |  91 |  40.0 |
| 666666604 |  91 |  40.0 |
| 666666605 |  92 |  40.0 |
| 666666606 |  91 |  40.0 |
| 666666607 |  61 |  40.0 |
| 666666608 |  62 |  40.0 |
| 666666609 |  63 |  40.0 |
| 666666610 |  61 |  40.0 |
| 666666611 |  61 |  40.0 |
| 666666612 |  61 |  40.0 |
| 666666613 |  61 |  30.0 |
| 666666613 |  62 |  10.0 |
| 666666613 |  63 |  10.0 |
| 666884444 |   7 |  40.0 |
| 673466642 |  22 |   4.0 |
| 849934919 |  95 |  23.0 |
| 888665555 |  20 |   5.0 |
| 906218888 |  29 |  15.0 |
| 913323708 |  92 |  33.0 |
| 913353347 |  22 |  30.0 |
| 987654321 |  20 |  15.0 |
| 987654321 |  30 |  20.0 |
| 987987987 |  10 |  35.0 |
| 987987987 |  30 |   5.0 |
| 999887777 |  10 |  10.0 |
| 999887777 |  30 |  30.0 |
| 999999999 |   5 |   2.0 |
| 999999999 |   6 |   2.0 |
| 999999999 |   7 |   4.0 |
| 999999999 |  10 |   4.0 |
| 999999999 |  20 |   4.0 |
| 999999999 |  30 |   4.0 |
| 999999999 |  61 |   4.0 |
| 999999999 |  62 |   4.0 |
| 999999999 |  63 |   4.0 |
| 999999999 |  70 |   2.0 |
| 999999999 |  91 |   2.0 |
| 999999999 |  92 |   1.0 |
| 999999999 |  95 |   3.0 |
+-----------+-----+-------+
97 rows in set (0.00 sec)
```
#### mysql> SELECT * FROM dependent;
```
+-----------+----------------+------+------------+--------------+
| Essn      | Dependent_name | Sex  | Bdate      | Relationship |
+-----------+----------------+------+------------+--------------+
| 222222200 | Jay Wallis     | M    | 1956-01-01 | Spouse       |
| 222222202 | Amenda Vile    | F    | 1913-12-28 | Children     |
| 222222202 | Mindy Vile     | F    | 1941-12-28 | Spouse       |
| 222222204 | Amy Vos        | F    | 1962-12-30 | Spouse       |
| 222222204 | james Vos      | M    | 1936-12-27 | Children     |
| 444444400 | Kathy          | F    | 1943-12-26 | Spouse       |
| 444444401 | Amy Bayes      | F    | 1925-12-27 | Children     |
| 444444401 | Tom Bayes      | M    | 1925-12-27 | Children     |
| 444444401 | William Bayes  | M    | 1953-12-27 | Spouse       |
| 666666601 | Mary Jarvice   | F    | 1963-12-29 | Spouse       |
| 666666602 | Bond King      | M    | 1963-12-29 | Spouse       |
| 666666604 | Monia King     | F    | 1954-12-26 | Spouse       |
| 666666605 | Aly Kramer     | F    | 1961-01-01 | Spouse       |
| 666666606 | Chistina King  | F    | 1947-12-28 | Spouse       |
| 666666607 | Alex Small     | F    | 1959-12-27 | Spouse       |
| 666666608 | Katherin Head  | F    | 1963-12-29 | Spouse       |
| 666666608 | Monica Head    | F    | 1936-12-27 | Children     |
| 666666608 | Rachel Head    | M    | 1936-12-27 | Children     |
| 888665151 | Mary Alice     | F    | 1923-12-30 | Spouse       |
| 987987987 | Jalil Ahmad    | M    | 1928-12-30 | Children     |
| 987987987 | Khadeja Begum  | F    | 1948-12-26 | Spouse       |
| 999887777 | John Smith     | M    | 1956-01-01 | Spouse       |
+-----------+----------------+------+------------+--------------+
22 rows in set (0.00 sec)
```
### 1.Select all the attributes for all employees whose last name is 'Jones' or ‘James’.
#### mysql> SELECT * FROM employee WHERE Lname IN ('Jones','James');
```
+-------+-------+-------+-----------+------------+-------------------------------+------+----------+-----------+-----+
| Fname | Minit | Lname | Ssn       | Bdate      | Address                       | Sex  | Salary   | Super_ssn | Dno |
+-------+-------+-------+-----------+------------+-------------------------------+------+----------+-----------+-----+
| Jared | D     | James | 111111100 | 1965-12-26 | 123 Peachtr,Atlanta,GA        | M    | 85000.00 | null      |   6 |
| Jon   | C     | Jones | 111111101 | 1967-01-01 | 111 Allgood,Atlanta,GA        | M    | 45000.00 | 111111100 |   6 |
| Megan | G     | Jones | 254937381 | 1961-01-01 | 528 Stone CT,Chicago,IL       | F    | 62000.00 | 666666600 |   8 |
| John  | C     | James | 555555500 | 1974-12-29 | 766 Bloomington,Sacramento,CA | M    | 81000.00 | null      |   8 |
+-------+-------+-------+-----------+------------+-------------------------------+------+----------+-----------+-----+
4 rows in set (0.00 sec)
```
### 2.Select all the attributes for all employees whose first name is 'Kim' or ‘Wilson’.
#### mysql> SELECT * FROM employee WHERE Fname IN ('Kim','Wilson');
```
+--------+-------+--------+-----------+------------+-----------------------------+------+----------+-----------+-----+
| Fname  | Minit | Lname  | Ssn       | Bdate      | Address                     | Sex  | Salary   | Super_ssn | Dno |
+--------+-------+--------+-----------+------------+-----------------------------+------+----------+-----------+-----+
| Wilson | A     | Holmes | 242916639 | 1970-12-27 | 21 South Co,Arlington,TX    | M    | 72500.00 | 555555500 |   4 |
| Kim    | C     | Grace  | 333333300 | 1969-12-28 | 667 Mills Ave,Sacramento,CA | F    | 79000.00 | null      |   6 |
| Kim    | G     | Ted    | 444222666 | 1967-12-31 | 3648 Tree Cir,Austin,TX     | M    | 50000.00 | 999999999 |   8 |
+--------+-------+--------+-----------+------------+-----------------------------+------+----------+-----------+-----+
3 rows in set (0.00 sec)
```
#### 3.Select the names and Ssn of employees who work on more than one project and count the total hours that the employees work on.  
### mysql> SELECT Fname, Lname, Ssn, sum(works_on.Hours)
   #### -> FROM EMPLOYEE, WORKS_ON
   #### -> WHERE Ssn=Essn
   #### -> GROUP BY Fname, Lname, Ssn
   #### -> HAVING count(*) > 1;
  ```
+----------+----------+-----------+---------------------+
| Fname    | Lname    | Ssn       | sum(works_on.Hours) |
+----------+----------+-----------+---------------------+
| Ahmad    | Jabbar   | 987987987 |                40.0 |
| Alicia   | Zelaya   | 999887777 |                40.0 |
| Cameron  | Thirteen | 111422203 |                50.0 |
| Erin     | Maxfield | 242535609 |                40.0 |
| Frank    | Wong     | 333445555 |                30.0 |
| Jake     | Sheen    | 245239264 |                55.0 |
| Jennifer | Wallace  | 987654321 |                35.0 |
| John     | Smith    | 123456789 |                40.0 |
| Joyce    | English  | 453453453 |                40.0 |
| Leonard  | Moody    | 349273344 |                25.0 |
| Percy    | Liang    | 398172999 |                20.0 |
| Red      | Bacher   | 666666613 |                50.0 |
| Richard  | Koelbel  | 214370999 |                39.0 |
| Roy      | Lewallen | 999999999 |                40.0 |
| Wilson   | Holmes   | 242916639 |                35.0 |
+----------+----------+-----------+---------------------+
15 rows in set (0.01 sec)
```

### 4.For each PROJECT, retrieve the project name, number, and location plus the number of employees who works on the project.
#### mysql> SELECT Pnumber, Pname, Plocation, count(*)
   #### -> FROM PROJECT, WORKS_ON
   #### -> WHERE Pnumber=Pno
   #### -> GROUP BY Pnumber, Pname;
 ```
+---------+------------------+------------+----------+
| Pnumber | Pname            | Plocation  | count(*) |
+---------+------------------+------------+----------+
|       4 | EntityAnnot      | Houston    |        3 |
|       5 | Analysis         | Sacramento |        6 |
|       6 | EventManagement  | Sacramento |        5 |
|       7 | FoodDistribution | Sacramento |        5 |
|      10 | Computerization  | Stafford   |        6 |
|      11 | ConfigMgmt       | Atlanta    |        3 |
|      13 | DataMining       | Sacramento |        1 |
|      20 | Reorganization   | Houston    |        4 |
|      22 | SearchEngine     | Arlington  |        2 |
|      29 | MotherBoard      | Milwaukee  |        3 |
|      30 | Benefits         | Stafford   |        4 |
|      61 | OperatingSystem  | Sacramento |       11 |
|      62 | DatabaseSystems  | Atlanta    |       11 |
|      63 | Middleware       | Atlanta    |        9 |
|      70 | Advertizing      | Arlington  |        4 |
|      91 | InkjetPrinters   | Milwaukee  |       10 |
|      92 | LaserPrinters    | Milwaukee  |        5 |
|      95 | HumanResource    | Arlington  |        4 |
+---------+------------------+------------+----------+
18 rows in set (0.01 sec)
```
### 5.For each employee who works in department 5 on a project in Houston, retrieve the employee’s Ssn, first and last names, and the project number, name, and hours for each project that the employee works on.
#### mysql> select e.Ssn, e.Fname, e.Lname, p.Pnumber, p.Pname, w.Hours, e.Dno, p.Plocation
   #### -> from employee e join works_on w join project p
   #### -> on e.Ssn=w.Essn and w.Pno=p.Pnumber and e.Dno=p.Dnum
   #### -> where e.Dno=5 and p.Plocation='Houston';
```
+-----------+---------+--------+---------+-------------+-------+-----+-----------+
| Ssn       | Fname   | Lname  | Pnumber | Pname       | Hours | Dno | Plocation |
+-----------+---------+--------+---------+-------------+-------+-----+-----------+
| 636669233 | Michael | Morgan |       4 | EntityAnnot |  11.0 |   5 | Houston   |
+-----------+---------+--------+---------+-------------+-------+-----+-----------+
1 row in set (0.00 sec)
```
### 6.Retrieve the last name and first name of all employees who work more than 40 hours per week total (on all their projects).
#### mysql> SELECT Fname, Lname, Ssn, sum(works_on.Hours)
   #### -> FROM EMPLOYEE, WORKS_ON
   #### -> WHERE Ssn=Essn
   #### -> GROUP BY Fname, Lname, Ssn
   #### -> HAVING sum(works_on.Hours)>40;
```
+---------+----------+-----------+---------------------+
| Fname   | Lname    | Ssn       | sum(works_on.Hours) |
+---------+----------+-----------+---------------------+
| Andrea  | Sondrini | 614370310 |                45.0 |
| Cameron | Thirteen | 111422203 |                50.0 |
| Jake    | Sheen    | 245239264 |                55.0 |
| Jeff    | Chase    | 333333301 |                46.0 |
| Josh    | Zell     | 222222201 |                48.0 |
| Nandita | Ball     | 555555501 |                44.0 |
| Red     | Bacher   | 666666613 |                50.0 |
+---------+----------+-----------+---------------------+
7 rows in set (0.00 sec)
```
### 7.	Select the first and last name of each employee who is a supervisor, plus count the total number of employees supervised by each supervisor.
#### mysql> SELECT S1.Fname as Supervisor_Firstname, S1.Lname as Supervisor_Lastname, count(*) as totalnoofemp
   #### -> FROM employee S JOIN employee S1
   #### -> ON S.Super_ssn=S1.Ssn
   #### -> group by S1.Fname, S1.Lname, S1.Ssn;
```
+----------------------+---------------------+--------------+
| Supervisor_Firstname | Supervisor_Lastname | totalnoofemp |
+----------------------+---------------------+--------------+
| Ahmad                | Jabbar              |            1 |
| Alec                 | Best                |            1 |
| Alex                 | Freed               |            7 |
| Billie               | King                |            1 |
| Bob                  | Bender              |            4 |
| Bonnie               | Bays                |            1 |
| Carl                 | Reedy               |            1 |
| Evan                 | Wallis              |            3 |
| Frank                | Wong                |            3 |
| Gerald               | Small               |            1 |
| Jared                | James               |            4 |
| Jennifer             | Wallace             |            2 |
| Jill                 | Jarvis              |            1 |
| John                 | Ed                  |            1 |
| John                 | James               |            3 |
| John                 | Smith               |            1 |
| Josh                 | Zell                |            2 |
| Juan                 | Linda               |            2 |
| Kate                 | King                |            3 |
| Kim                  | Grace               |            1 |
| Lyle                 | Leslie              |            2 |
| Nandita              | Ball                |            2 |
| Naveen               | Drew                |            1 |
| Red                  | Bacher              |            2 |
| Roy                  | Lewallen            |            3 |
| Sam                  | Snedden             |            1 |
| Sammy                | Hall                |            2 |
| Shilpa               | Miller              |            4 |
+----------------------+---------------------+--------------+
28 rows in set (0.00 sec)
```
### 8. For each project determine the total hours that employees work on that project per week.
#### mysql> SELECT Pnumber as Project_No, Pname as Project_Name, sum(works_on.Hours) as Total_Hours
  ####  -> FROM PROJECT, WORKS_ON
  ####  -> WHERE Pnumber=Pno
  ####  -> GROUP BY Pnumber, Pname;
```
+------------+------------------+-------------+
| Project_No | Project_Name     | Total_Hours |
+------------+------------------+-------------+
|          4 | EntityAnnot      |        61.0 |
|          5 | Analysis         |        88.5 |
|          6 | EventManagement  |        44.5 |
|          7 | FoodDistribution |        74.0 |
|         10 | Computerization  |       119.0 |
|         11 | ConfigMgmt       |        65.0 |
|         13 | DataMining       |        18.0 |
|         20 | Reorganization   |        34.0 |
|         22 | SearchEngine     |        34.0 |
|         29 | MotherBoard      |        40.0 |
|         30 | Benefits         |        59.0 |
|         61 | OperatingSystem  |       358.0 |
|         62 | DatabaseSystems  |       347.0 |
|         63 | Middleware       |       250.0 |
|         70 | Advertizing      |        72.0 |
|         91 | InkjetPrinters   |       332.0 |
|         92 | LaserPrinters    |       158.0 |
|         95 | HumanResource    |       101.0 |
+------------+------------------+-------------+
18 rows in set (0.00 sec)
```
### 9. Find which employee has more than 2 dependents.
#### mysql> SELECT Fname, Lname, e.Ssn,count(*)
 ####   -> FROM employee e join dependent d
 ####   -> on e.Ssn=d.Essn
  ####  -> group by Fname, Lname
   #### -> having count(*)>2;
```
+--------+-------+-----------+----------+
| Fname  | Lname | Ssn       | count(*) |
+--------+-------+-----------+----------+
| Arnold | Head  | 666666608 |        3 |
| Bonnie | Bays  | 444444401 |        3 |
+--------+-------+-----------+----------+
2 rows in set (0.00 sec)
```
### 10. Find which employee has more than 1 children.
#### mysql> SELECT Fname as Employee_FirstName, Lname as Employee_LastName
 ####   -> FROM employee e join dependent d
  ####  -> on e.Ssn=d.Essn
  ####  -> where Relationship='Children'
  ####  -> group by Fname, Lname
  ####  -> having count(*)>1;
```
+--------------------+-------------------+
| Employee_FirstName | Employee_LastName |
+--------------------+-------------------+
| Arnold             | Head              |
| Bonnie             | Bays              |
+--------------------+-------------------+
2 rows in set (0.00 sec)
```
### Find all the employee who works in the department that is located in Atlanta. Select their first name and last name.
#### mysql> select Fname as FirstName, Lname as LastName
  ####  -> from employee e join dept_locations d
  ####  -> on e.Dno= d.Dnumber
   #### -> where d.Dlocation='Atlanta';
```
+-----------+----------+
| FirstName | LastName |
+-----------+----------+
| Alex      | Yu       |
| Jared     | James    |
| Jon       | Jones    |
| Justin    | Mark     |
| Brad      | Knight   |
| Debra     | Hall     |
| John      | Ed       |
| Christina | Hisel    |
| Jake      | Sheen    |
| Kim       | Grace    |
| Jeff      | Chase    |
| Jose      | Barbara  |
| Cindy     | Burklow  |
| Nandita   | Ball     |
| Penny     | Wolowitz |
| Zach      | Geller   |
+-----------+----------+
16 rows in set (0.00 sec)
```
### 12.	Find all the departments located in Houston and list how many projects are their under those departments.
#### mysql> select d.Dnumber, de.Dname, count(*) as no_of_projects
  ####  -> from dept_locations d join project p join department de
  ####  -> on d.Dnumber=p.Dnum and de.Dnumber=d.Dnumber
  ####  -> where d.Dlocation='Houston'
  ####  -> group by d.Dnumber;
 ```
+---------+--------------+----------------+
| Dnumber | Dname        | no_of_projects |
+---------+--------------+----------------+
|       1 | Headquarters |              1 |
|       5 | Research     |              1 |
+---------+--------------+----------------+
2 rows in set (0.00 sec)
```
#### 1. Insert a record ('Services', 1, '123456789', '11-AUG-2012') into DEPARTMENT.
```
mysql> INSERT INTO DEPARTMENT (Dname,Dnumber,Mgr_ssn,Mgr_start_date) VALUES ('Services', 1, '123456789', '2012-08-11');
ERROR 1062 (23000): Duplicate entry '1' for key 'PRIMARY'
```
#### 2. Insert a record ('Purchasing', 3, '990110110', '02-FEB-2013') into DEPARTMENT.
```
mysql> INSERT INTO DEPARTMENT (Dname,Dnumber,Mgr_ssn,Mgr_start_date) VALUES ('Purchasing', 3, '990110110', '2013-02-02');
ERROR 1062 (23000): Duplicate entry '3' for key 'PRIMARY'
```
#### 3. Insert a record ('Customers', 12, '333445555', '14-JAN-2013') into DEPARTMENT.
```
mysql> INSERT INTO DEPARTMENT (Dname,Dnumber,Mgr_ssn,Mgr_start_date) VALUES ('Customers', 12, '333445555', '2013-01-14');
Query OK, 1 row affected (0.08 sec)
```
#### 4. Update the Dnumber of the DEP_LOCATIONS record with Dlocation='Seattle' to 9.
```
mysql> UPDATE DEPT_LOCATIONS SET Dnumber =9 WHERE Dlocation='Seattle';
Query OK, 1 row affected (0.08 sec)
Rows matched: 1  Changed: 1  Warnings: 0
```
#### 5. Update the Salary of the EMPLOYEE record with SSN=444444444 to 55000.
```
mysql> UPDATE EMPLOYEE SET SALARY =55000 WHERE SSN=444444444;
Query OK, 0 rows affected (0.00 sec)
Rows matched: 0  Changed: 0  Warnings: 0
```
#### 6. Insert a record ('Jane', 'B', 'Smith', '666666606', '01-MAR-1980', '3556 W Second Street,Miami,FL', 'F', 85000, '666666603', 5) into EMPLOYEE.
```
mysql> INSERT INTO EMPLOYEE (Fname, Minit, Lname, Ssn, Bdate, Address, Sex,Salary,Super_ssn,Dno) VALUES ('Jane', 'B', 'Smith', '666666606', '01-MAR-1980', '3556 W Second Street,Miami,FL', 'F', 85000, '666666603', 5);
ERROR 1062 (23000): Duplicate entry '666666606' for key 'PRIMARY'
```
#### 7. Update the hours of the WORKS_ON record with Pno=1 for the employee with SSN='666884444' to 25.
```
mysql> UPDATE WORKS_ON set Hours=25.0 WHERE Pno=1 and Essn='666884444';
Query OK, 0 rows affected (0.01 sec)
Rows matched: 0  Changed: 0  Warnings: 0
```
#### 8. Delete the EMPLOYEE record with Ssn= '432765098'.
```
mysql> DELETE FROM EMPLOYEE WHERE Ssn= '432765098';
Query OK, 1 row affected (0.08 sec)
```
#### 9. Delete the DEPARTMENT record with DNUMBER = 9.
```
mysql> DELETE FROM DEPARTMENT WHERE DNUMBER = 9;
ERROR 1451 (23000): Cannot delete or update a parent row: a foreign key constraint fails (`company`.`employee`, CONSTRAINT `FK_DNO` FOREIGN KEY (`Dno`) REFERENCES `department` (`Dnumber`) ON DELETE NO ACTION ON UPDATE CASCADE)
```
#### 10. Delete all the dependents of employee with Ssn = '666666608'
```
mysql> DELETE FROM DEPENDENT WHERE Essn = '666666608';
Query OK, 3 rows affected (0.05 sec)
```
### 5.Execute 3 more Insert commands in SQLPLUS that attempt to insert 3 more records, such that the records violate the integrity constraints. Make each of the 3 records violate a different type of integrity constraint. Capture your commands in spool files for turning in
```
mysql> insert into dept_locations(Dnumber) values(7);
ERROR 1364 (HY000): Field 'Dlocation' doesn't have a default value

mysql> INSERT INTO EMPLOYEE(Fname, Minit, Lname, Ssn, Bdate, Address, Sex,Salary,Super_ssn,Dno) values ('Shilpa', 'M', 'Venkatesh', '001614905', '1979-11-08', '607 Summit Ave,dallas,TX','F','60000','123456789',6);
ERROR 1062 (23000): Duplicate entry '001614905' for key 'PRIMARY'

mysql> INSERT INTO DEPARTMENT VALUES('Sales', 15,'001514905','1976-11-08');
ERROR 1062 (23000): Duplicate entry 'Sales' for key 'Dname'
```
### 6.Execute a command in SQLPLUS to Delete a record that violates a referential integrity constraint. Capture your command in a spool file for turning in.
```
mysql> DELETE FROM EMPLOYEE WHERE Ssn= '110110110';
ERROR 1451 (23000): Cannot delete or update a parent row: a foreign key constraint fails (`company`.`department`, CONSTRAINT `FK_MGRSSNN` FOREIGN KEY (`Mgr_ssn`) REFERENCES `employee` (`Ssn`) ON UPDATE CASCADE)

mysql> DELETE FROM DEPARTMENT WHERE DNUMBER = 9;
ERROR 1451 (23000): Cannot delete or update a parent row: a foreign key constraint fails (`company`.`employee`, CONSTRAINT `FK_DNO` FOREIGN KEY (`Dno`) REFERENCES `department` (`Dnumber`) ON DELETE NO ACTION ON UPDATE CASCADE)

mysql> update Dependent set Essn='222222274' where Dependent_name='Amy Vos';
ERROR 1452 (23000): Cannot add or update a child row: a foreign key constraint fails (`company`.`dependent`, CONSTRAINT `FK_ESSN` FOREIGN KEY (`Essn`) REFERENCES `employee` (`Ssn`))
```
### 7.Repeat 5, but Insert three new records that do not violate any integrity constraints. Capture your commands in spool files for turning in.
```
mysql> insert into dept_locations(Dnumber, Dlocation) values(7,'Florida');
Query OK, 1 row affected (0.05 sec)

mysql> INSERT INTO EMPLOYEE(Fname, Minit, Lname, Ssn, Bdate, Address, Sex,Salary,Super_ssn,Dno) values ('Shilpa', 'M', 'Venkatesh', '001614906', '1979-11-08', '607 Summit Ave,dallas,TX','F','60000','123456789',6);
Query OK, 1 row affected (0.08 sec)

mysql> INSERT INTO DEPARTMENT VALUES('Property', 28,'999999999','1976-11-08');
Query OK, 1 row affected (0.08 sec)

mysql> notee
```
