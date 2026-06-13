# Spring Learning Repository

A collection of Spring Framework examples covering core concepts, dependency injection, collection injection, and database connectivity using Spring JDBC.

## Technologies Used

* Java 8
* Spring Core
* Spring JDBC
* MySQL
* Maven
* Eclipse IDE

## Projects Included

### 1. Spring Core - Collection Injection

Demonstrates Spring Dependency Injection using XML configuration.

**Concepts Covered:**

* Setter Injection
* Constructor Injection
* List Injection
* Set Injection
* Map Injection
* Bean Relationships

**Classes:**

* Student
* College

---

### 2. Spring JDBC - Employee Management

Demonstrates database connectivity using Spring JDBC and JdbcTemplate.

**Concepts Covered:**

* DataSource Configuration
* JdbcTemplate
* Dependency Injection
* DAO Pattern
* MySQL Integration

**Classes:**

* Employee
* EmployeeDao

---

## Repository Structure

```text
Spring1
│
├── com.collegemanagement
│   ├── Application.java
│   └── model
│       ├── College.java
│       └── Student.java
│
├── com.employeemanagement
│   ├── Application.java
│   ├── model
│   │   └── Employee.java
│   └── dao
│       └── EmployeeDao.java
│
├── applicationContext.xml
├── jdbcContext.xml
└── README.md
```

## Learning Objectives

This repository was created to practice and understand:

* Spring IoC Container
* Dependency Injection
* XML-Based Configuration
* Collection Injection
* Spring JDBC
* JdbcTemplate
* Database Operations
* DAO Design Pattern

## Future Enhancements

* Spring Autowiring
* Spring Annotations
* Spring AOP
* Spring MVC
* Spring Boot
* Spring Data JPA
