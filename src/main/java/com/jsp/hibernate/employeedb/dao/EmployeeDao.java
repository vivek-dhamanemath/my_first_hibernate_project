package com.jsp.hibernate.employeedb.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.jsp.hibernate.employeedb.entity.Employee;
import java.util.Scanner;

public class EmployeeDao {

    Configuration cfg = new Configuration().configure().addAnnotatedClass(Employee.class);
    SessionFactory sf = cfg.buildSessionFactory();

    public void addEmployee(Scanner scanner) {
        System.out.println("Enter Employee ID:");
        int employeeId = scanner.nextInt();
        System.out.println("Enter Employee Name:");
        String employeeName = scanner.next();
        System.out.println("Enter Employee Email:");
        String email = scanner.next();
        System.out.println("Enter Employee Designation:");
        String designation = scanner.next();
        System.out.println("Enter Employee Salary:");
        int salary = scanner.nextInt();

        Session session = sf.openSession();
        Transaction tran = session.beginTransaction();
        try {
            Employee employee = new Employee();
            employee.setEmployeeId(employeeId);
            employee.setEmployeeName(employeeName);
            employee.setEmail(email);
            employee.setDesignation(designation);
            employee.setSalary(salary);
            session.save(employee);
            tran.commit();
        } catch (Exception e) {
            if (tran != null) tran.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void findEmployee(Scanner scanner) {
        System.out.println("Enter Employee ID to find:");
        int id = scanner.nextInt();

        Session session = sf.openSession();
        Transaction tran = session.beginTransaction();
        Employee employee = null;
        try {
            employee = session.get(Employee.class, id);
            tran.commit();
        } catch (Exception e) {
            if (tran != null) tran.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        System.out.println("Employee Details: " + employee);
    }

    public void updateEmployee(Scanner scanner, int updateChoice) {
        System.out.println("Enter Employee ID to update:");
        int employeeId = scanner.nextInt();

        Session session = sf.openSession();
        Transaction tran = session.beginTransaction();
        try {
            Employee employee = session.get(Employee.class, employeeId);
            if (employee != null) {
                switch (updateChoice) {
                    case 1:
                        System.out.println("Enter new Employee Name:");
                        String employeeName = scanner.next();
                        employee.setEmployeeName(employeeName);
                        break;
                    case 2:
                        System.out.println("Enter new Employee Designation:");
                        String designation = scanner.next();
                        employee.setDesignation(designation);
                        break;
                    case 3:
                        System.out.println("Enter new Employee Email:");
                        String email = scanner.next();
                        employee.setEmail(email);
                        break;
                    case 4:
                        System.out.println("Enter new Employee Salary:");
                        int salary = scanner.nextInt();
                        employee.setSalary(salary);
                        break;
                    default:
                        System.out.println("Invalid choice");
                        return;
                }
                session.update(employee);
                tran.commit();
            }
        } catch (Exception e) {
            if (tran != null) tran.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void deleteEmployee(Scanner scanner) {
        System.out.println("Enter Employee ID to delete:");
        int id = scanner.nextInt();

        Session session = sf.openSession();
        Transaction tran = session.beginTransaction();
        try {
            Employee employee = session.get(Employee.class, id);
            if (employee != null) {
                session.delete(employee);
                tran.commit();
            }
        } catch (Exception e) {
            if (tran != null) tran.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}