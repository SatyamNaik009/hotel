(*Note: Configure Application Properties(secret key,access key and bucket-name) Navigate to:backend\src\main\resources\application.properties file)
(Also Update the bucketName in backend\src\main\java\com\hotel\backend\service\AwsS3Service.java file)

Project Title: E-Booking website

Description:This project is a comprehensive web platform designed to simplify the process of booking hotel rooms. Leveraging Java with Spring Boot on the backend and React on the frontend, EasyStay offers a user-friendly interface where users can browse, search, and book hotel accommodations effortlessly. The platform integrates real-time room availability updates, and personalized user profiles to enhance the booking experience. With responsive design and intuitive navigation, it ensures a seamless booking journey for both guests and hotel managers alike.

Technologies Used:

Backend Development:
Java: Core programming language for backend logic.
Spring Boot: Framework for rapid application development, handling dependency injection, MVC architecture, and RESTful web services.
Spring Data: Simplifies database interaction with JPA repositories.
Spring Security: Ensures secure authentication and authorization.

Frontend Development:
React: JavaScript library for building interactive user interfaces.
React Router: Enables client-side routing for a smooth, single-page application experience.
Axios: Handles asynchronous HTTP requests to the backend API.

Database:
MySQLL: Relaional database management system for storing hotel information, user data, and booking details.
Hibernate: ORM (Object-Relational Mapping) tool for mapping Java objects to database tables and vice versa.

Other Technologies:
HTML & CSS: Markup and styling for frontend UI components.
JWT (JSON Web Tokens): Used for secure authentication and session management.
Git: Version control system for collaborative development and code management.
Maven: Dependency management tools for building and managing Java-based projects.

Prerequisites:
Java Development Kit (JDK):
Ensure JDK 8 or higher is installed. You can download it from the Oracle website or use OpenJDK.

Integrated Development Environment (IDE):
Recommended IDEs include IntelliJ IDEA, Eclipse, or VS Code with appropriate plugins for Java and React development.

Node.js and npm:
Install Node.js and npm from Node.js official website.

MySQL Database:
Set up and configure MySQL database server. Install MySQL from MySQL website.

Step-by-Step Installation Guide:

Backend Setup (Java with Spring Boot):

Clone the Repository:
Clone the repository from your version control system (e.g., GitLab, GitHub).

Import Backend Project:
Open your IDE and import the backend project as a Maven project.

Configure Application Properties:
Navigate to src/main/resources/application.properties.

Run the Application:
Run the backend application class to start the Spring Boot application.

Verify Backend Setup:
Access http://localhost:8080 to ensure the backend is running without errors. You may see a default Spring Boot page or a customized landing page if implemented.

Frontend Setup (React):

Navigate to Frontend Directory:
Open a terminal or command prompt.
Navigate to the frontend directory within your cloned repository (e.g., src/main/frontend).

Install Dependencies:
Run npm install to install all frontend dependencies specified in package.json.

Start the Development Server:
Run npm start to start the frontend development server.

Verify Frontend Setup:
Access http://localhost:3000 in your web browser to view the React application. You should see the frontend .

Database Setup:
Create Database Schema:
Use MySQL Workbench or SQLYog to create a database schema.

Final Steps:

Integrate Frontend with Backend:
Update frontend API endpoints (axios calls) in React components to match backend URL (http://localhost:8080).

Test Functionality:
Test the complete functionality of EasyStay, including user registration, hotel search, room booking, and payment processing.

By following these steps, you should have set up and running on your local development environment.
