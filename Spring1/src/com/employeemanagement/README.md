# Spring JDBC - Employee Management System

## Overview

This project demonstrates how to integrate Spring JDBC with a MySQL database using `JdbcTemplate`.

The application performs employee record insertion into a database table by leveraging Spring's Dependency Injection and JDBC support.

## Technologies Used

* Java 8
* Spring Core
* Spring JDBC
* MySQL
* Eclipse IDE
* XML Configuration

## Project Structure

```text
com.employeemanagement
│
├── Application.java
│
├── model
│   └── Employee.java
│
└── dao
    └── EmployeeDao.java
```

## Features

* Add Employee Records
* Spring Dependency Injection
* Database Connectivity using Spring JDBC
* JdbcTemplate Integration
* XML-Based Configuration

## Database Configuration

The application uses MySQL as the backend database.

### Database

```sql
CREATE DATABASE jdbc;
```

### Employee Table

```sql
CREATE TABLE emp (
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(50),
    salary DOUBLE,
    designation VARCHAR(50)
);
```

## Spring Concepts Covered

### Dependency Injection

Injecting `JdbcTemplate` into the DAO class through Spring configuration.

```xml
<property name="jdbcTemplate" ref="jdbcTemplate"/>
```

### DataSource Configuration

```xml
<bean id="dataSource"
      class="org.springframework.jdbc.datasource.DriverManagerDataSource">
</bean>
```

### JdbcTemplate

Using Spring's JdbcTemplate to execute SQL queries.

```java
String query = "INSERT INTO emp VALUES (?, ?, ?, ?)";

jdbcTemplate.update(
        query,
        employee.getEmployeeId(),
        employee.getEmployeeName(),
        employee.getSalary(),
        employee.getDesignation()
);
```

## Application Flow

1. Load Spring Container.
2. Create DataSource.
3. Create JdbcTemplate.
4. Inject JdbcTemplate into EmployeeDao.
5. Read Employee Details from User.
6. Insert Employee Record into MySQL Database.
7. Display Success Message.

## Sample Input

```text
Employee ID: 101
Employee Name: Ram
Salary: 50000
Designation: Developer
```

## Sample Output

```text
Employee record saved successfully.
```

## Learning Outcomes

After completing this project, you will understand:

* Spring JDBC Architecture
* JdbcTemplate
* DataSource Configuration
* Dependency Injection
* DAO Design Pattern
* MySQL Integration with Spring
* Executing SQL Queries using Spring JDBC

```
```
