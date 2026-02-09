# 🧑‍💼 Employee Management System

A **Java-based Employee Management System** built using **Spring MVC, Hibernate, MySQL**, and **Apache Tomcat**.  
The application supports **CRUD operations** on employee records with **role-based access control** using **Spring Security**.

---

## 📌 Project Overview

The Employee Management System (EMS) is a web application designed to manage employee information efficiently.  
It allows administrators and managers to perform operations such as adding, updating, deleting, and viewing employee records while enforcing secure role-based access.

---

## ✨ Features

- 👤 Add new employees
- ✏️ Update employee details
- 🗑️ Delete employees
- 📋 View all employee records
- 🔐 Role-based authentication & authorization
  - **Admin**: Full access (CRUD)
  - **Manager**: View & Update
- 🗄️ Persistent storage using MySQL
- 🧩 MVC architecture (Controller, Service, DAO)

---

## 🛠️ Tech Stack

| Layer | Technology |
|-----|-----------|
| Language | Java |
| Framework | Spring MVC |
| ORM | Hibernate |
| Security | Spring Security |
| Database | MySQL |
| Frontend | JSP, HTML, CSS |
| Build Tool | Maven |
| Server | Apache Tomcat |

---

## 📂 Project Structure
'''
EmployeeManagementSystem
│
├── src/main/java
│ └── com.ems
│ ├── controller
│ │ └── EmployeeController.java
│ │
│ ├── service
│ │ ├── EmployeeService.java
│ │ └── EmployeeServiceImpl.java
│ │
│ ├── dao
│ │ ├── EmployeeDAO.java
│ │ └── EmployeeDAOImpl.java
│ │
│ ├── model
│ │ └── Employee.java
│ │
│ └── config
│ ├── HibernateConfig.java
│ ├── SpringConfig.java
│ └── SecurityConfig.java
│
├── src/main/webapp
│ ├── WEB-INF
│ │ ├── views
│ │ │ ├── add-employee.jsp
│ │ │ ├── update-employee.jsp
│ │ │ └── list-employees.jsp
│ │ └── web.xml
│
├── pom.xml
└── README.md
'''
