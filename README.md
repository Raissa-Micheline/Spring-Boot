# 🚀 Spring Framework Master Guide

Welcome to the unified master repository for the **Spring Framework**. This repository serves as a comprehensive, modular guide and reference for building robust, secure, and enterprise-grade Java applications using modern Spring technologies.

---

## 📌 Repository Roadmap & Modules

This repository is organized into dedicated branches for each core component of the Spring ecosystem. Below is an overview of what we cover across our development lifecycle:

### 1. Spring Web MVC (`spring-mvc`) — *Current Focus*
* **Core Concepts:** DispatcherServlet, Controllers (`@Controller`, `@RestController`), Request Mapping (`@RequestMapping`, `@GetMapping`, `@PostMapping`).
* **Data Handling:** Request parameters, path variables, request bodies, and validation (`@Valid`).
* **View Resolution & Response:** Returning JSON/XML via MessageConverters and integrating template engines or RESTful APIs.
* **Exception Handling:** Global exception handling using `@ControllerAdvice` and `@ExceptionHandler`.

### 2. Spring Security (`spring-security`)
* **Authentication & Authorization:** Configuring security filter chains, custom authentication providers, and password encoding (`PasswordEncoder`).
* **Access Control:** Method-level security (`@PreAuthorize`) and URL-based authorization rules.
* **JWT & OAuth2:** Implementing stateless authentication tokens and integrating OAuth2 login workflows.

### 3. Spring Data JPA & Database Persistence (`spring-jpa`)
* **ORM & Entities:** Mapping Java classes to relational database tables using JPA annotations (`@Entity`, `@Table`, `@Id`, `@GeneratedValue`).
* **Repositories:** Leveraging `JpaRepository`, `CrudRepository`, and defining custom JPQL/Native queries.
* **Transaction Management:** Managing database boundaries declaratively using `@Transactional`.

### 4. DTO Pattern & Architecture (`dto-pattern`)
* **Separation of Concerns:** Decoupling database entities from API request and response contracts.
* **Data Transfer Objects:** Designing clean, secure, and payload-specific DTO classes to prevent over-posting and under-posting vulnerabilities.

### 5. Object Mapping (`object-mapper`)
* **Mapping Frameworks:** Utilizing tools like **MapStruct** or ModelMapper to automate and optimize the conversion between Entities and DTOs.
* **Custom Mappers:** Handling nested objects, conditional mapping, and type conversions cleanly.

### 6. Database Relationships (`database-relationships`)
* **Mapping Associations:** Implementing unidirectional and bidirectional relationships:
  * **One-to-One (`@OneToOne`)**
  * **One-to-Many / Many-to-One (`@OneToMany`, `@ManyToOne`)**
  * **Many-to-Many (`@ManyToOne` with Join Tables)**
* **Cascade Types & Fetch Strategies:** Managing cascading operations (`CascadeType.ALL`, etc.) and optimizing performance with Lazy vs. Eager loading.

---

## 🌿 Branching Strategy & Naming Conventions

To keep our modules clean, isolated, and easy to navigate, every core topic has its own dedicated branch in this repository. 

### Branch Naming Convention
We follow a feature/module-based naming structure:
* `feature/<module-name>` or simply `<module-name>`

### Active Branches Overview

| Branch Name | Description | Status |
| :--- | :--- | :--- |
| `main` | Master repository documentation and root overview. | Active |
| `spring-mvc` | Contains Spring MVC controllers, request handling, and REST endpoints. | Completed |
| `spring-security` | Implementation of security filters, authentication, and JWT. | Planned / Upcoming |
| `spring-jpa` | Database configuration, entity models, and repository interfaces. | Planned / Upcoming |
| `dto-pattern` | Implementation of Data Transfer Objects for decoupled API layers. | Planned / Upcoming |
| `object-mapper` | MapStruct configurations and mapping utility implementations. | Planned / Upcoming |
| `database-relationships` | Advanced JPA entity mappings, cascading, and fetch types. | Planned / Upcoming |

---

## 🛠️ Getting Started

1. Clone the repository:
   ```bash
   git clone [https://github.com/Raissa-Micheline/Spring-Boot.git](https://github.com/Raissa-Micheline/Spring-Boot.git)
