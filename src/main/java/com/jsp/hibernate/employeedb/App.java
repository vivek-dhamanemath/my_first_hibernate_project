package com.jsp.hibernate.employeedb;

import java.util.Scanner;
import com.jsp.hibernate.employeedb.dao.EmployeeDao;

public class App {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDao();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Add Employee");
            System.out.println("2. Find Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    employeeDao.addEmployee(scanner);
                    break;
                case 2:
                    employeeDao.findEmployee(scanner);
                    break;
                case 3:
                    System.out.println("Choose a column to update:");
                    System.out.println("1. Name");
                    System.out.println("2. Designation");
                    System.out.println("3. Email");
                    System.out.println("4. Salary");
                    int updateChoice = scanner.nextInt();
                    employeeDao.updateEmployee(scanner, updateChoice);
                    break;
                case 4:
                    employeeDao.deleteEmployee(scanner);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
