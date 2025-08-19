# 🏥 Patient Management System (Microservices with Spring Boot & AWS)

A **production-ready Patient Management System** built step-by-step with **Java Spring Boot microservices**, **gRPC**, **Kafka**, **JWT Auth**, **API Gateway**, **Docker**, and deployed on **AWS (CloudFormation, ECS, RDS, MSK, LocalStack)**.

This project is inspired by the https://www.youtube.com/watch?v=tseqdcFfTUY&t=36920s tutorial and demonstrates how to design, implement, and deploy a scalable backend system from scratch.

---

## 🚀 Tech Stack

- **Backend Framework**: Java 21+, Spring Boot (Web, Data JPA, Validation, Security)
- **Databases**: PostgreSQL, In-Memory DB (H2 for testing)
- **Communication**: REST, gRPC, Kafka
- **Authentication**: JWT, Spring Security
- **API Gateway**: Spring Cloud Gateway
- **Infrastructure**: Docker, Docker Compose, LocalStack
- **Cloud**: AWS (CloudFormation, ECS, MSK, RDS, VPC)
- **Testing**: Unit & Integration Tests (JUnit, Mockito, Spring Test)

---

## 📖 Project Overview

The system is composed of multiple microservices:
- **Patient Service** → CRUD operations, validations, gRPC client, Kafka producer
- **Billing Service** → gRPC server for patient billing
- **Analytics Service** → Kafka consumer for patient analytics
- **Auth Service** → User management, login, JWT token generation & validation
- **API Gateway** → Central entry point, routing, and security filters
- **Infrastructure** → AWS resources (VPC, DB, MSK, ECS, Load Balancer) managed via CloudFormation

---

## 📂 Project Structure

```
patient-management/
 ├── patient-service/       # CRUD operations, Kafka producer, gRPC client
 ├── billing-service/       # gRPC server for billing
 ├── analytics-service/     # Kafka consumer for analytics
 ├── auth-service/          # JWT authentication & user management
 ├── api-gateway/           # Routing & security filters
 └── infrastructure/        # AWS CloudFormation templates & scripts
```
---

## 📺 Learning Path (Video Chapters → Repo Progress)

- **Part 1 – Core Setup**: dev setup, project structure, models, repositories, services, controllers
- **Part 2 – Validation & Error Handling**: request DTOs, exception handling, validation logic
- **Part 3 – Dockerization & Databases**: patient service DB setup, Docker, fixes
- **Part 4 – Inter-service Communication**: gRPC intro, billing service, client-server communication
- **Part 5 – Event Streaming**: Kafka intro, producer in patient service, analytics consumer, tests
- **Part 6 – API Gateway & Auth**: gateway setup, JWT auth, filters, integration with patient service
- **Part 7 – Testing**: integration tests for auth & patient services
- **Part 8 – Infrastructure & Deployment**: AWS LocalStack, CloudFormation, ECS cluster, MSK, load balancer, deployment & troubleshooting

---

## 🛠️ How to Run Locally

1. **Clone the repo**:
```bash
git clone https://github.com/Evancel/patient-management.git

cd patient-management
```

2. **Build all services**:
```bash
./mvnw clean install
```

3. **Run services with Docker Compose**:
```bash
docker-compose up --build
```

4. **Access services locally**:
- Patient Service → [http://localhost:4000/api/patients](http://localhost:4000/api/patients)
- Auth Service → [http://localhost:4005/auth/login](http://localhost:4005/auth/login)
- API Gateway → [http://localhost:4004](http://localhost:4004)
- Swagger/OpenAPI Docs → available per service

---

## 🧪 Tests

Run unit & integration tests:
```bash
./mvnw test
```

---

## 🌩️ AWS Deployment (via LocalStack)

1. Configure LocalStack & AWS CLI
2. Build Docker images for all services
3. Deploy infrastructure with CloudFormation:
```bash
./localstack-deploy.sh
```
4. Verify deployment & test services

---

## 📌 Features Implemented

- ✅ CRUD operations for patients
- ✅ Request validation & error handling
- ✅ gRPC communication (Patient ↔ Billing)
- ✅ Kafka event streaming (Patient → Analytics)
- ✅ JWT-based authentication & authorization
- ✅ API Gateway with routing & filters
- ✅ Dockerized services with DB integration
- ✅ AWS-ready deployment with CloudFormation

---

## 📜 License

This project is for learning and demonstration purposes.  
Feel free to fork, improve, and adapt it for your own use 🚀  
