# Hibernate Employee Database Project

## Introduction

The Hibernate Employee Database project is a simple Java application that demonstrates the use of Hibernate ORM (Object-Relational Mapping) to perform CRUD (Create, Read, Update, Delete) operations on an employee database. This project provides a command-line interface for users to interact with the database and manage employee records.

## Technologies Used

- **Java**: The core programming language used for developing the application.
- **Hibernate**: An ORM framework that simplifies the interaction between Java applications and relational databases.
- **MySQL**: The relational database management system used to store employee data.
- **Maven**: A build automation tool used to manage project dependencies and build the project.

## Project Structure

The project consists of the following main components:

- **App.java**: The main class that provides a command-line interface for users to interact with the application.
- **EmployeeDao.java**: The Data Access Object (DAO) class that contains methods for performing CRUD operations on the employee database.
- **Employee.java**: The entity class that represents an employee in the database.

## How to Run the Project

1. **Clone the Repository**: Clone the project repository from GitHub to your local machine.
2. **Configure Database**: Ensure that MySQL is installed and running on your machine. Create a database named `hibernate_employee`.
3. **Update Configuration**: Update the Hibernate configuration file (`hibernate.cfg.xml`) with your MySQL database credentials.
4. **Build the Project**: Use Maven to build the project by running the command `mvn clean install`.
5. **Run the Application**: Run the `App.java` class to start the application.

## Detailed Information

### App.java

The `App.java` class provides a command-line interface for users to interact with the application. It repeatedly prompts the user to choose an operation until the user decides to exit. The available operations are:

1. Add Employee
2. Find Employee
3. Update Employee
4. Delete Employee
5. Exit

### EmployeeDao.java

The `EmployeeDao.java` class contains methods for performing CRUD operations on the employee database. The methods are:

- `addEmployee(Scanner scanner)`: Prompts the user to enter employee details and adds a new employee to the database.
- `findEmployee(Scanner scanner)`: Prompts the user to enter an employee ID and retrieves the corresponding employee details from the database.
- `updateEmployee(Scanner scanner, int updateChoice)`: Prompts the user to enter an employee ID and choose a column to update (Name, Designation, Email, Salary). Updates the specified column with the new value provided by the user.
- `deleteEmployee(Scanner scanner)`: Prompts the user to enter an employee ID and deletes the corresponding employee from the database.

### Employee.java

The `Employee.java` class is an entity class that represents an employee in the database. It contains fields for employee ID, name, email, designation, and salary, along with getter and setter methods for each field.

## Output

Here is an example output of the application:

```
Jan 03, 2025 7:14:30 PM org.hibernate.Version logVersion
INFO: HHH000412: Hibernate ORM core version 5.4.33.Final
Jan 03, 2025 7:14:32 PM org.hibernate.annotations.common.reflection.java.JavaReflectionManager <clinit>
INFO: HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
Jan 03, 2025 7:14:32 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)
Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.
Jan 03, 2025 7:14:32 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001005: using driver [com.mysql.jdbc.Driver] at URL [jdbc:mysql://localhost:3306/hibernate_employee?createDatabaseIfNotExist=true]
Jan 03, 2025 7:14:32 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001001: Connection properties: {password=****, user=root}
Jan 03, 2025 7:14:32 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001003: Autocommit mode: false
Jan 03, 2025 7:14:32 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
INFO: HHH000115: Hibernate connection pool size: 20 (min=1)
Jan 03, 2025 7:14:33 PM org.hibernate.dialect.Dialect <init>
INFO: HHH000400: Using dialect: org.hibernate.dialect.MySQL8Dialect
Jan 03, 2025 7:14:33 PM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@7f7b6639] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
Jan 03, 2025 7:14:34 PM org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService
INFO: HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
Choose an operation:
1. Add Employee
2. Find Employee
3. Update Employee
4. Delete Employee
5. Exit
1
Enter Employee ID:
01
Enter Employee Name:
Vivek
Enter Employee Email:
vivek@gmail.com
Enter Employee Designation:
CEO
Enter Employee Salary:
8500000
Hibernate: insert into Employee (designation, email, employeeName, salary, employeeId) values (?, ?, ?, ?, ?)
Choose an operation:
1. Add Employee
2. Find Employee
3. Update Employee
4. Delete Employee
5. Exit
1
Enter Employee ID:
02
Enter Employee Name:
Vinay
Enter Employee Email:
vinay@gmail.com
Enter Employee Designation:
CFO
Enter Employee Salary:
95000000
Hibernate: insert into Employee (designation, email, employeeName, salary, employeeId) values (?, ?, ?, ?, ?)
Choose an operation:
1. Add Employee
2. Find Employee
3. Update Employee
4. Delete Employee
5. Exit
2
Enter Employee ID to find:
01
Hibernate: select employee0_.employeeId as employee1_0_0_, employee0_.designation as designat2_0_0_, employee0_.email as email3_0_0_, employee0_.employeeName as employee4_0_0_, employee0_.salary as salary5_0_0_ from Employee employee0_ where employee0_.employeeId=?
Employee Details: Employee [employeeId=1, employeeName=Vivek, email=vivek@gmail.com, designation=CEO, salary=8500000]
Choose an operation:
1. Add Employee
2. Find Employee
3. Update Employee
4. Delete Employee
5. Exit
3
Choose a column to update:
1. Name
2. Designation
3. Email
4. Salary
4
Enter Employee ID to update:
02
Hibernate: select employee0_.employeeId as employee1_0_0_, employee0_.designation as designat2_0_0_, employee0_.email as email3_0_0_, employee0_.employeeName as employee4_0_0_, employee0_.salary as salary5_0_0_ from Employee employee0_ where employee0_.employeeId=?
Enter new Employee Salary:
120
Hibernate: update Employee set designation=?, email=?, employeeName=?, salary=? where employeeId=?
Choose an operation:
1. Add Employee
2. Find Employee
3. Update Employee
4. Delete Employee
5. Exit
4
Enter Employee ID to delete:
02
Hibernate: select employee0_.employeeId as employee1_0_0_, employee0_.designation as designat2_0_0_, employee0_.email as email3_0_0_, employee0_.employeeName as employee4_0_0_, employee0_.salary as salary5_0_0_ from Employee employee0_ where employee0_.employeeId=?
Hibernate: delete from Employee where employeeId=?
Choose an operation:
1. Add Employee
2. Find Employee
3. Update Employee
4. Delete Employee
5. Exit
5
Exiting...
```
