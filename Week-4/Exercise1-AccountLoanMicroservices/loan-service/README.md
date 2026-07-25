# Exercise 1 - Loan Microservice

## Objective
Develop a Spring Boot REST Microservice that exposes Loan details through a GET API.

## Technologies Used
- Java 17
- Spring Boot 3
- Spring Web
- Maven
- Postman

## REST Endpoint
GET
http://localhost:8082/loan

## Build
bash
mvn clean install

## Run
bash
mvn spring-boot:run

## Sample Output
json
{
    "loanNumber": 2001,
    "loanType": "Home Loan",
    "loanAmount": 1500000.0
}

## Result
Successfully developed and tested the Loan Microservice using Spring Boot.