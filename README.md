# 🚗 Vehicle Service Data Operations (Lab Sheet 03)

This project is a Spring Boot-based Backend REST API solution developed for **Lab Sheet 03** of the **COSC 32133 - Full-Stack Software Development** course. Its primary function is to manage vehicle service records, focusing on data retrieval and deletion functionalities.

## ✨ Implemented Features

This API successfully addresses the three main questions required by Lab Sheet 03:

1.  **GET by Year (Q1):** Retrieve a list of all vehicle service records for a specific service year.
2.  **GET Vehicle Type (Q2):** Retrieve **only the vehicle type** based on the provided Service ID.
3.  **DELETE by Year (Q3):** Delete all vehicle service records associated with a specific service year from the database.

## 🛠️ Technologies & Architecture

| Component | Description |
| :--- | :--- |
| **Backend** | Java (Spring Boot) |
| **Database** | MySQL |
| **ORM** | Spring Data JPA / Hibernate |
| **Dependencies** | Lombok, Spring Web, MySQL Connector, HikariCP |
| **Architecture** | Layered Architecture (Controller, Service, Repository, Entity, DTO) |
| **Port** | 8081 (As defined by `server.port=8081`) |

## 🚀 API Endpoints

| Purpose | HTTP Method | Endpoint | Controller Method |
| :--- | :--- | :--- | :--- |
| **Q1: Get by Year** | `GET` | `/api/service/year/{year}` | `getVehiclesByYear` |
| **Q2: Get Vehicle Type** | `GET` | `/api/service/service-id/{id}` | `getServicebyId` |
| **Q3: Delete by Year** | `DELETE` | `/api/service/delete-service/{year}` | `deleteservice` |

## 📂 Code Structure

The project adheres to the **Separation of Concerns** principle and is divided into five distinct layers:

1.  **`.Controller`:** Manages incoming HTTP requests and outgoing responses.
2.  **`.Services`:** Implements the business logic and validation (e.g., checking if records exist before deletion).
3.  **`.Repository`:** Handles CRUD operations with the database using Spring Data JPA.
4.  **`.Entity`:** Represents the database table (`vehical`) structure.
5.  **`.DTO` (Data Transfer Object):** Used to safely transfer data between layers and prevent direct exposure of the database entity to the client.
