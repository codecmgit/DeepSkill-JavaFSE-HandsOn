# Exercise 4 - Update Employee REST Service

## Objective
Develop a Spring Boot RESTful Web Service to update employee details using the HTTP PUT method. Implement Bean Validation, exception handling, and test the service using Postman.

---

## Technologies Used
- Java 17+
- Spring Boot 3
- Maven
- Spring Web
- Spring Validation
- XML Bean Configuration
- REST API
- Postman

---

## Project Structure
src
├── main
│   ├── java
│   │   └── com.week3.employee
│   │       ├── controller
│   │       ├── dao
│   │       ├── exception
│   │       ├── service
│   │       ├── Employee.java
│   │       ├── Department.java
│   │       ├── Skill.java
│   │       └── EmployeeApplication.java
│   └── resources
│       ├── application.properties
│       └── employee.xml

---

## REST Endpoint
| Method | Endpoint | Description |
|---------|----------|-------------|
| PUT | `/employees` | Updates an existing employee |

---

## Build
bash
mvn clean install

---

## Run
bash
mvn spring-boot:run


Application starts on:
http://localhost:8080


---

## Testing using Postman

### Request
**Method**
http
PUT


**URL**
http://localhost:8080/employees

### Request Body
json
{
    "employeeId": 101,
    "employeeName": "John Updated",
    "department": {
        "departmentId": 1,
        "departmentName": "IT"
    },
    "skills": null
}

### Successful Response
json
{
    "employeeId": 101,
    "employeeName": "John Updated",
    "department": {
        "departmentId": 1,
        "departmentName": "IT"
    },
    "skills": null
}

---

## Validation Test

### Request
json
{
    "employeeId": 101,
    "employeeName": "",
    "department": {
        "departmentId": 1,
        "departmentName": "IT"
    }
}


### Response
400 BAD REQUEST
Validation Failed


---

## Exception Test

### Request
json
{
    "employeeId": 999,
    "employeeName": "Unknown",
    "department": {
        "departmentId": 1,
        "departmentName": "IT"
    }
}

### Response
404 NOT FOUND
Employee with ID 999 not found

---

## Output
- Employee details updated successfully.
- Bean Validation implemented.
- Global Exception Handler implemented.
- REST API tested successfully using Postman.

---

## Expected Console Output
Tomcat started on port(s): 8080 (http)
Started EmployeeApplication
---

## Concepts Used
- Spring Boot REST API
- PUT Mapping
- Controller Layer
- Service Layer
- DAO Layer
- Bean Validation
- Exception Handling
- Global Exception Handler
- Dependency Injection
- Maven
- Postman API Testing