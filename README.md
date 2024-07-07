# Book Management System

## This README provides:

1. An overview of the project
2. Features list
3. Technologies used
4. Prerequisites
5. Setup and installation instructions
6. API endpoints
7. Sample JSON payloads
8. Instructions for running tests
9. Information on how to contribute

## Overview
- This is a simple Book Management System built with Spring Boot. It provides a RESTful API for performing CRUD (Create, Read, Update, Delete) operations on book records.

## Features
- Create new books
- Retrieve a list of all books
- Retrieve a specific book by ID
- Update existing book details
- Delete books

## Technologies Used
- Java 11
- Spring Boot 2.5.x
- Spring Data JPA
- MySQL (or H2 for development)
- Maven

## Prerequisites
- JDK 11 or later
- Maven 3.x
- MySQL (for production use)

## Setup and Installation
1. Clone the repository:
git clone https://github.com/kamalharsh14/Books-Management-System.git

2. Navigate to the project directory:
cd book-management-system

3. Configure the database:
For MySQL: Update `src/main/resources/application.properties` with your MySQL credentials.
For H2 (development): No additional configuration needed.

4. Build the project:
mvn clean install

5. Run the application:
mvn spring-boot:run
The application will start running at `http://localhost:8080`.

## API Endpoints

| Method | Url | Description | Sample Valid Request Body |
| ------ | --- | ----------- | ------------------------- |
| GET    | /api/books | Get all books | |
| GET    | /api/books/{id} | Get book by id | |
| POST   | /api/books | Create new book | [JSON](#bookcreatejson) |
| PUT    | /api/books/{id} | Update book | [JSON](#bookupdatejson) |
| DELETE | /api/books/{id} | Delete book | |

## Sample Valid JSON Request Bodys

##### <a id="bookcreatejson">Create Book -> /api/books</a>
```json
{
"title": "The Great Gatsby",
"author": "F. Scott Fitzgerald",
"isbn": "9780743273565"
}
```

##### <a id="bookupdatejson">Update Book -> /api/books/{id}</a>
```json
{
  "title": "The Great Gatsby",
  "author": "F. Scott Fitzgerald",
  "isbn": "9780743273565"
}
```

## Testing
- To run the tests, execute:
- mvn test


## Contributing
- Contributions are welcome! Please feel free to submit a Pull Request.