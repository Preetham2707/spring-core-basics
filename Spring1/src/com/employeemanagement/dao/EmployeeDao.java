package com.employeemanagement.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.employeemanagement.model.Employee;

public class EmployeeDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String saveEmployee(Employee employee) {

        String query =
                "INSERT INTO emp VALUES (?, ?, ?, ?)";

        jdbcTemplate.update(
                query,
                employee.getEmployeeId(),
                employee.getEmployeeName(),
                employee.getSalary(),
                employee.getDesignation()
        );

        return "Employee record saved successfully.";
    }
}