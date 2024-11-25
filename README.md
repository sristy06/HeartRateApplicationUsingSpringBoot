Janitri Backend Assignment
This project is a simplified backend system for managing users, patients, and heart rate data using Spring Boot. It includes a set of RESTful APIs for user registration and login, managing patient information, and recording heart rate data.
________________________________________
Table of Contents
1.	Project Overview
2.	Technologies Used
3.	Setup Instructions
4.	API Endpoints
5.	Database Structure
6.	Assumptions and Design Decisions
7.	Future Enhancements
________________________________________
Project Overview
This project provides RESTful APIs to:
•	Register and authenticate users.
•	Add and retrieve patient details.
•	Record and retrieve heart rate data for patients.
________________________________________
Technologies Used
•	Java 11 or higher
•	Spring Boot (Spring Web, Spring Data JPA, Spring Validation)
•	MYSQL Database (in-memory for development/testing)
•	Maven (build and dependency management)
________________________________________
Setup Instructions
Prerequisites:
•	Java 11 or higher
•	Maven
Steps to Run the Project:
1.	Clone the repository:
bash
Copy code
git clone <your-repo-url>
cd janitri-backend
2.	Build the project:
bash
Copy code
mvn clean install
3.	Run the Spring Boot application:
bash
Copy code
mvn spring-boot:run
4.	Access the application:
o	The application will run on http://localhost:8080.
________________________________________
API Endpoints
1. User APIs
Endpoint	Method	Description	Request Body
/api/users/register	POST	Register a new user	{ "email": "test@example.com", "password": "password" }
/api/users/login	POST	Login with email and password	{ "email": "test@example.com", "password": "password" }
2. Patient APIs
Endpoint	Method	Description	Request Body
/api/patients/add	POST	Add a new patient	{ "name": "John Doe", "age": "30" }
/api/patients/{id}	GET	Get details of a patient by ID	None
3. Heart Rate APIs
Endpoint	Method	Description	Request Body
/api/heartrate/record	POST	Record heart rate for a patient	{ "patientId": 1, "heartRate": 75 }
/api/heartrate/patient/{patientId}	GET	Get heart rate data by patient ID	None
________________________________________
Database Structure
Tables:
1.	Users Table:
o	id (Long, Primary Key)
o	email (String, unique)
o	password (String)

2.	Patients Table:
o	id (Long, Primary Key)
o	name (String)
o	age (String)

3.	HeartRate Table:
o	id (Long, Primary Key)
o	patient_id (Foreign Key referencing patients.id)
o	heart_rate (Integer)
________________________________________
Assumptions and Design Decisions
1.	Authentication:
o	Simplified email-password authentication without token-based security.
o	No role-based access control implemented.

2.	Database:
o	Using an H2 in-memory database for demonstration purposes.
o	Data is reset upon server restart.

3.	Heart Rate Recording:
o	Each heart rate entry is linked to a specific patient via patient_id.
________________________________________
Future Enhancements
1.	Implement JWT-based authentication for secure endpoints.
2.	Integrate a relational database (like MySQL or PostgreSQL).
3.	Add unit tests for better test coverage.
4.	Enhance error handling and validation messages.
5.	Create endpoints for updating and deleting patients or heart rate records.
________________________________________
Contributors
•	Your Name – https://github.com/sristy06/HeartRateApplicationUsingSpringBoot
________________________________________
License
This project is licensed under the Sristy License.
