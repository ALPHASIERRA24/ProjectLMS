Notes here
Upadated Project Structure for Thymeleaf Integration:

└── LMS_backend/
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   └── com/
    │   │   │       └── library/
    │   │   │           └── demo/
    │   │   │               ├── BackendApplication.java
    │   │   │               ├── Controller/
    │   │   │               │   ├── AuthController.java
    │   │   │               │   ├── BookController.java
    │   │   │               │   ├── LendingController.java
    │   │   │               │   └── UserController.java
    │   │   ├── resources/
    │   │   │   ├── static/  ✅ (For static assets like CSS, JS, and images)
    │   │   │   │   ├── css/
    │   │   │   │   │   ├── style.css
    │   │   │   │   ├── js/
    │   │   │   │   │   ├── script.js
    │   │   │   │   ├── images/
    │   │   │   ├── templates/ ✅ (For Thymeleaf HTML files)
    │   │   │   │   ├── index.html
    │   │   │   │   ├── books.html
    │   │   │   │   ├── login.html
    │   │   │   │   ├── register.html
    │   │   │   ├── application.properties

Step 2:
Add dependecy in pom.xml as follows:
  <dependencies>
    <!-- Thymeleaf dependency -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>

    <!-- Spring Boot Web dependency (if not already added) -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
</dependencies>

Step 3:
Create a Controller to Handle Thymeleaf Pages Modify your BookController.java:
