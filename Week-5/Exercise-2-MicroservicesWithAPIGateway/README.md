# Exercise 2 - API Gateway

## Objective
Implement API Gateway architecture using Spring Boot Microservices.

## Projects Included
1. Eureka Server
2. Greet Service
3. API Gateway

## Technologies Used
- Java 17
- Spring Boot
- Spring Web
- Maven

## Project Structure
Exercise-2-API-Gateway
│
├── eureka-server
├── greet-service
├── api-gateway
└── README.md

## Services
| Service | Port |
|----------|------|
| Eureka Server | 8761 |
| Greet Service | 8085 |
| API Gateway | 9090 |

## Endpoint

### Greet Service
GET
http://localhost:8085/greet

### API Gateway
http://localhost:9090

### Eureka Server
http://localhost:8761

## Build Command
bash
mvn clean install

## Run Command
bash
mvn spring-boot:run

## Outcome
Successfully created an API Gateway architecture with Eureka Server and Greet Service using Spring Boot.