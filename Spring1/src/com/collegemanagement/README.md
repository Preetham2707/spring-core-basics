# Spring Core - Collection Injection Example

## Overview

This project demonstrates how to perform Dependency Injection using Spring Core XML configuration.

The application models a simple College and Student relationship and showcases how Spring injects:

* Primitive values
* Object references
* Lists
* Sets
* Maps
* Constructor Injection
* Setter Injection

## Technologies Used

* Java 8
* Spring Core
* Eclipse IDE
* XML Configuration

## Project Structure

```text
com.collegemanagement
│
├── Application.java
│
└── model
    ├── College.java
    └── Student.java
```

## Features Demonstrated

### Student Bean

The Student object contains:

* Student ID
* Student Name
* Marks
* Room Numbers (Set)
* Subjects (List)

### College Bean

The College object contains:

* College ID
* College Name
* Location
* Student Object Reference
* Examination Centers (Map)

## Spring Concepts Covered

### Setter Injection

Injecting values using property tags.

```xml
<property name="studentName" value="Ram"/>
```

### Constructor Injection

Injecting dependencies through constructors.

```xml
<constructor-arg value="2020"/>
```

### Collection Injection

#### List Injection

```xml
<list>
    <value>Java</value>
    <value>Python</value>
</list>
```

#### Set Injection

```xml
<set>
    <value>101</value>
    <value>102</value>
</set>
```

#### Map Injection

```xml
<map>
    <entry key="201" value="Center A"/>
    <entry key="202" value="Center B"/>
</map>
```

## Sample Output

```text
College{
    collegeId=2020,
    collegeName='ABC College',
    location='Mumbai',
    student=Student{
        studentId=1000,
        studentName='Ram',
        marks=80.0,
        roomNumbers=[101, 102],
        subjects=[Java, Python, Ruby]
    },
    examCenters={201=Center A, 202=Center B}
}
```

## Learning Outcomes

After completing this project, you will understand:

* Spring IoC Container
* Dependency Injection
* XML-Based Configuration
* Constructor Injection
* Setter Injection
* Collection Injection
* Bean Relationships
