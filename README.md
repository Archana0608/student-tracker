# Student Tracker

A full-stack web application to manage student test schedules, mark tracking, and notifications — built using Spring Boot and MySQL.

## Features

### Admin Module
- Add and map tests to students
- Send test notifications (subject name, date, etc.)
- Update student marks

### Student Module
- View mapped test schedules
- View updated marks

### UI/UX
- Responsive and modern layout
- Background images for login/registration pages
- Clean color palette for all other pages

## Tech Stack

- **Backend:** Java, Spring Boot, Hibernate
- **Frontend:** HTML, CSS, Bootstrap (Thymeleaf)
- **Database:** MySQL
- **Build Tool:** Maven
- **IDE:** VS Code / Eclipse

## How to Run This Project

1. Clone the repository:
2. git clone https://github.com/Archana0608/student-tracker.git
2. Open the project in VS Code or Eclipse.
3. Make sure MySQL is installed and running on your system.
4. Configure your MySQL `application.properties` like:
     spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
     spring.datasource.username=your_mysql_username
     spring.datasource.password=your_mysql_password
     spring.jpa.hibernate.ddl-auto=update
5. Run the application:
     mvn spring-boot:run
6. Open your browser and go to:
     http://localhost:8080

## Future Enhancements (Planned)

- Performance analytics dashboard with charts
- Attendance tracking and reports
- Email/SMS notifications to students/parents
- Assignment upload and submission system

## Author

**Archana N.**  
Full Stack Developer | MCA | java full stack developer
GitHub: https://github.com/Archana0608

