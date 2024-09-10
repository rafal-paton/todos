# Simple To Do List

A web application that allows users to manage a list of tasks to be done. The application follows a layered architecture, includes a RESTful API, and performs CRUD operations for efficient task management.

## Features

- Create, read, update, and delete tasks (CRUD operations).
- RESTful API implementation for task management.
- Simple and clean user interface.
- Persistence using an in-memory database (H2).
- Data migration handled by Flyway.
- Built with a focus on maintainable and clean code architecture.

## Technologies Used

- **Java**: Core programming language.
- **Spring Boot**: Framework for building the backend and RESTful services.
- **Hibernate**: ORM for managing the database interactions.
- **Maven**: Dependency management and build tool.
- **H2 Database**: In-memory database for development and testing.
- **Flyway**: Database migration tool.
- **JavaScript, HTML, CSS**: Frontend technologies for the user interface.

## Getting Started

### Prerequisites

- **Java 17** or higher
- **Maven 3.6** or higher

### Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/rafal-paton/todos.git
   cd todos
   ```

2. **Build the project:**

   ```bash
   mvn clean install
   ```

3. **Run the application:**

   ```bash
   mvn spring-boot:run
   ```

4.	The application will be accessible at http://localhost:8080.

## Usage

API Endpoints

	•	GET /api/tasks - Retrieve all tasks.
	•	POST /api/tasks - Create a new task.
	•	PUT /api/tasks/{id} - Update an existing task.
	•	DELETE /api/tasks/{id} - Delete a task.

Database

	•	The application uses an in-memory H2 database.
	•	You can access the H2 console at http://localhost:8080/h2-console.
	•	Use the following credentials:
	•	JDBC URL: jdbc:h2:mem:testdb
	•	Username: sa
	•	Password: (leave empty)


