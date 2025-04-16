# HR Project - Human Resources Management

This project is a human resources management application developed with **Spring Boot** and **React*. It allows performing CRUD operations (Create, Read, Update, Delete) on employees, using a data model based on `Employee` and `EmployeeDto`.

## Backend:
## Features

- **List employees**: Retrieve a list of all registered employees.
- **Get employee by ID**: Fetch information for a specific employee.
- **Create or update employees**: Add new employees or update existing ones.
- **Delete employees**: Remove employees by their ID.
- **Object mapping**: Use of `ModelMapper` to convert between entities and DTOs.

## Technologies used

- **Java 17**
- **Spring Boot 3.x**
- **Maven**
- **Spring Data JPA** (with support for relational databases)
- **ModelMapper** (for entity-to-DTO conversion)
- **SLF4J** (for logging)
- **CORS** enabled for the frontend at `http://localhost:3000`

## Project structure

- **Controller**: Handles HTTP requests and delegates logic to the service.
- **Service**: Contains business logic.
- **Repository**: Interacts with the database using Spring Data JPA.
- **Models**: Defines entities (`Employee`) and DTOs (`EmployeeDto`).

## Frontend:
## Features
- View a list of employees with their details (ID, Name, Department, Salary).
- Add new employees to the system.
- Edit existing employee details.
- Delete employees from the system.
- Responsive design using **Bootstrap**.

- ## Technologies Used

- **React**: Frontend library for building user interfaces.
- **React Router**: For routing and navigation.
- **Axios**: For making HTTP requests to the backend API.
- **React Number Format**: For formatting salary values.
- **Bootstrap**: For styling and responsive design.
