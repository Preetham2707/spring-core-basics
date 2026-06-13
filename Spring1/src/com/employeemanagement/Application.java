package com.employeemanagement;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.employeemanagement.dao.EmployeeDao;
import com.employeemanagement.model.Employee;

public class Application {

    public static void main(String[] args) {

        try (
                ClassPathXmlApplicationContext context =
                        new ClassPathXmlApplicationContext("employeeJdbcContext.xml");

                Scanner scanner = new Scanner(System.in)
        ) {

            EmployeeDao employeeDao =
                    context.getBean("employeeDao", EmployeeDao.class);

            System.out.println("Enter Employee Details");
            System.out.print("Employee ID: ");
            int employeeId = scanner.nextInt();

            System.out.print("Employee Name: ");
            String employeeName = scanner.next();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            System.out.print("Designation: ");
            String designation = scanner.next();

            Employee employee = new Employee(
                    employeeId,
                    employeeName,
                    salary,
                    designation
            );

            System.out.println(
                    employeeDao.saveEmployee(employee)
            );
        }
    }
}