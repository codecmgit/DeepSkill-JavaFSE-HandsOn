# Exercise 1 - Account Loan Microservices

## Objective
Implement a basic Microservices architecture using Spring Boot and Eureka Discovery Server.

## Projects Included
1. Eureka Discovery Server
2. Account Service
3. Loan Service

## Technologies Used
- Java 17
- Spring Boot
- Spring Web
- Maven
- Eureka Discovery Server

## Project Structure
Exercise-1-AccountLoanMicroservices
│
├── eureka-discovery-server
├── account-service
├── loan-service
└── README.md

## Services
| Service | Port |
|----------|------|
| Eureka Discovery Server | 8761 |
| Account Service | 8081 |
| Loan Service | 8082 |

## Endpoints

### Account Service
GET
http://localhost:8081/account

### Loan Service
GET
http://localhost:8082/loan

### Eureka Dashboard
http://localhost:8761

## Build Command
bash
mvn clean install

## Run Command
bash
mvn spring-boot:run

## Outcome
Successfully created Account and Loan Microservices with a Eureka Discovery Server.