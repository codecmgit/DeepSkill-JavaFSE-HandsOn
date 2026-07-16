# Exercise 3 - Department REST Service

## Objective
Develop a Spring Boot RESTful Web Service to retrieve the list of departments using XML-based configuration. The service is exposed through a REST endpoint and tested using Postman.

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

---

## REST Endpoint
| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/departments` | Returns the list of all departments |

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
http
GET

**URL**
http://localhost:8080/departments

### Response
[
    {
        "departmentId": 1,
        "departmentName": "IT"
    },
    {
        "departmentId": 2,
        "departmentName": "HR"
    },
    {
        "departmentId": 3,
        "departmentName": "Finance"
    }
]

---

## Output
- Department data is loaded from `employee.xml`.
- REST API successfully returns the department list in JSON format.
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