# Exercise 1 - Account Microservice

## Objective
Develop a Spring Boot microservice that exposes account information through a REST API.

## Technologies Used
- Java 17
- Spring Boot 3
- Maven
- Spring Web

## Build
bash
mvn clean install

## Run
bash
mvn spring-boot:run

## Endpoint
GET
http://localhost:8081/account

## Sample Output
json
{
  "accountNumber":1001,
  "accountHolder":"John Smith",
  "balance":50000.0
}
