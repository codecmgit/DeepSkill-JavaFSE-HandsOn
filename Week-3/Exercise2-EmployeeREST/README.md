# Exercise 2 - Employee REST Service

## Objective
Develop a Spring Boot RESTful Web Service that returns employee details using XML-based configuration. The service is tested using Postman.

---

## Technologies Used
- Java 17+
- Spring Boot 3
- Maven
- Spring Web
- XML Bean Configuration
- REST API
- Postman

---

## Project Structure

```
src
├── main
│   ├── java
│   │   └── com.week3.employee
│   │       ├── controller
│   │       ├── dao
│   │       ├── model
│   │       ├── service
│   │       └── EmployeeApplication.java
│   └── resources
│       ├── application.properties
│       └── employee.xml
```

---

## REST Endpoint

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/employees` | Returns the list of all employees |

---

## Build
mvn clean install
---

## Run
mvn spring-boot:run

Application starts on:
http://localhost:8080

---

## Testing using Postman

### Request
**Method**
GET

**URL**
http://localhost:8080/employees

### Response
json
[
    {
        "employeeId": 101,
        "employeeName": "John",
        "department": {
            "departmentId": 1,
            "departmentName": "IT"
        },
        "skills": null
    },
    {
        "employeeId": 102,
        "employeeName": "Mary",
        "department": {
            "departmentId": 2,
            "departmentName": "HR"
        },
        "skills": null
    },
    {
        "employeeId": 103,
        "employeeName": "David",
        "department": {
            "departmentId": 3,
            "departmentName": "Finance"
        },
        "skills": null
    }
]

### Result
- Successfully retrieved the employee list through the REST API.
- Employee details are returned in JSON format.
- REST endpoint tested successfully using Postman.

---

## Output
- Employee data is loaded from `employee.xml`.
- REST API successfully returns employee details in JSON format.
- API tested successfully using Postman.

---

## Expected Console Output
Tomcat started on port(s): 8080 (http)
Started EmployeeApplication

---

## Concepts Used
- Spring Boot REST API
- Controller Layer
- Service Layer
- DAO Layer
- XML Bean Configuration
- Dependency Injection
- Maven
- JSON Response
- Postman API Testing