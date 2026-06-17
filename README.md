# Meditrack - Drug Expiry and Inventory Tracker

## Project Overview

Meditrack is a Spring Boot based REST API application designed to manage medicine inventory in pharmacies and medical stores. The system helps track medicine stock levels, identify low-stock medicines, and monitor expired medicines.

## Features

### Medicine Management (CRUD Operations)

* Add a new medicine
* View all medicines
* View medicine by ID
* Update medicine details
* Delete medicine

### Inventory Tracking

* Identify medicines with low stock
* Track expired medicines

## Technologies Used

* Java 17
* Spring Boot
* Spring Data JPA
* MySQL
* Maven
* Lombok
* Postman (API Testing)

## API Endpoints

### Add Medicine

POST /api/medicines

### Get All Medicines

GET /api/medicines

### Get Medicine By ID

GET /api/medicines/{id}

### Update Medicine

PUT /api/medicines/{id}

### Delete Medicine

DELETE /api/medicines/{id}

### Get Low Stock Medicines

GET /api/medicines/low-stock

### Get Expired Medicines

GET /api/medicines/expired

## Database

The application uses MySQL for storing medicine records.

### Medicine Fields

* id
* name
* batchNumber
* manufacturer
* quantity
* minimumStock
* expiryDate
* price
* createdAt

## Sample Low Stock Response

```json
[
  {
    "id": 2,
    "name": "Crocin",
    "quantity": 5,
    "minimumStock": 20
  }
]
```

## Sample Expired Medicine Response

```json
[
  {
    "id": 3,
    "name": "Expired Tablet",
    "expiryDate": "2024-01-01"
  }
]
```

## Author

Durva Kashid

## Future Enhancements

* User Authentication and Authorization
* Dashboard and Reports
* Email Notifications for Expired Medicines
* Medicine Search and Filtering
* Deployment on Cloud Platform
