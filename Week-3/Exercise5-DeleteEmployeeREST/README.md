# Exercise 5 - Delete Employee REST Service

## Objective
Develop a Spring Boot RESTful Web Service to delete an employee using the HTTP DELETE method. Implement exception handling and test the service using Postman.

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
| DELETE | `/employees/{id}` | Deletes an employee by Employee ID |

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
DELETE

**URL**
http://localhost:8080/employees/101

### Successful Response
json
{
    "employeeId": 101,
    "employeeName": "John",
    "department": {
        "departmentId": 1,
        "departmentName": "IT"
    },
    "skills": null
}

---

## Exception Test

### Request
DELETE http://localhost:8080/employees/101
(After the employee has already been deleted.)

### Response
404 NOT FOUND
Employee with ID 101 not found

---

## Output
- Employee deleted successfully.
- Exception generated for invalid employee ID.
- REST API tested successfully using Postman.

---

## Expected Console Output
Tomcat started on port(s): 8080 (http)
Started EmployeeApplication

---

## Concepts Used
- Spring Boot REST API
- DELETE Mapping
- Controller Layer
- Service Layer
- DAO Layer
- Exception Handling
- Dependency Injection
- Maven
- Postman API Testing