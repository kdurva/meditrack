# Meditrack

Meditrack is a Spring Boot REST API for managing medicine records. It allows users to perform basic CRUD (Create, Read, Update, Delete) operations on medicines using REST endpoints.

## Features

* Add a new medicine
* View all medicines
* Update medicine details
* Delete a medicine
* RESTful API implementation
* Spring Security configuration
* Maven project structure

## Tech Stack

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* Spring Security
* Maven
* H2 Database (or the configured database)

## Project Structure

```
meditrack/
├── src/
│   ├── main/
│   │   ├── java/com/meditrack/
│   │   │   ├── config/
│   │   │   ├── controller/
│   │   │   ├── dto/
│   │   │   ├── entity/
│   │   │   ├── repository/
│   │   │   └── MeditrackApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
├── mvnw
└── mvnw.cmd
```

## Getting Started

### Clone the repository

```bash
git clone https://github.com/<your-username>/meditrack.git
```

### Run the application

Using Maven Wrapper:

```bash
./mvnw spring-boot:run
```

Or on Windows:

```bash
mvnw.cmd spring-boot:run
```

The application will start on:

```
http://localhost:8080
```

## API Endpoints

| Method | Endpoint          | Description       |
| ------ | ----------------- | ----------------- |
| GET    | `/medicines`      | Get all medicines |
| POST   | `/medicines`      | Add a medicine    |
| PUT    | `/medicines/{id}` | Update a medicine |
| DELETE | `/medicines/{id}` | Delete a medicine |

## Author

Durva Kashid
