package com.collegemanagement;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.collegemanagement.model.College;

public class Application {

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("collegeContext.xml")) {

            College college = context.getBean("college", College.class);

            System.out.println(college);
        }
    }
}