# E-Commerce-Web-Automation
Overview

This project simulates a real-world e-commerce platform and demonstrates a complete end-to-end automation testing framework built using Java, Selenium WebDriver, Cucumber (BDD), and JUnit.
It covers functional flows such as user login, product browsing, filtering, sorting, adding to cart, and checkout, enabling reliable test execution and easy scalability.

The goal of this project is to apply real-time QA Automation skills and showcase best practices in designing, developing, and maintaining automated test frameworks.

Key Features

BDD Framework (Cucumber) – Human-readable test scenarios that bridge communication between QA and business teams.

Page Object Model (POM) – Modular and reusable design for improved maintainability.

Dynamic Test Data – Parameterized input for product filters, prices, and quantities through feature files.

JUnit & Maven Integration – For test execution, build management, and reporting.

Cross-Browser Support – Easy to configure and extend for Chrome, Edge, and Firefox.

Reporting – Integrated Cucumber HTML and JSON reports for test result visualization.

Scalable Structure – Follows industry standards suitable for enterprise-level applications.

Project Structure
EcommerceAutomation/
│
├── src/test/java/
│   ├── features/
│   │   └── product_purchase_flow.feature
│   ├── stepdefinitions/
│   │   ├── LoginSteps.java
│   │   ├── ProductSteps.java
│   │   └── CartSteps.java
│   ├── pageobjects/
│   │   ├── LoginPage.java
│   │   ├── BooksPage.java
│   │   ├── ProductPage.java
│   │   └── CartPage.java
│   ├── utils/
│   │   └── DriverFactory.java
│   └── runners/
│       └── TestRunner.java
│
├── pom.xml

Author
Mahesh Munna
QA Automation Engineer | Java | Selenium | BDD | API Testing
