# 🏦 Fintech Modular Core (Java 21)

An industry-focused **Modular Monolith** designed for high-concurrency banking operations. This architecture addresses the "Microservice Tax" by maintaining strict domain boundaries without the overhead of distributed systems.

### 🌟 Key Architecture
- **Domain Driven Design (DDD):** Logic is partitioned into independent modules (Payments, Accounts, Audit).
- **Spring Modulith:** Enforces architectural constraints via unit tests to prevent spaghetti code.
- **Java 21 Virtual Threads:** Used for non-blocking audit logging and high-throughput transaction processing.

### 🛠 Tech Stack
- **Core:** Java 21, Spring Boot 3.3
- **Modularity:** Spring Modulith
- **Data:** Spring Data JPA, PostgreSQL
- **Testing:** JUnit 5, AssertJ
