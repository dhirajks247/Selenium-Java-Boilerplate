# Selenium Java Boilerplate with Allure Reporting

This is a simple boilerplate structure for a **Selenium + Java** project with **Allure reporting** using **Page Object Model**. It is modular, designed for easy setup, and scalable for future growth.

## Project Folder Structure

```
selenium-java-project/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           ├── pages/
│   │   │           │   └── LoginPage.java
│   │   │           ├── utils/
│   │   │           │   ├── DriverManager.java
│   │   │           │   └── ConfigReader.java
│   │   │           └── constants/
│   │   │               └── Constants.java
│   │   └── resources/
│   │       └── config.properties
│   │
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── tests/
│                       ├── BaseTest.java
│                       └── LoginTest.java
│
├── test-output/
├── allure-results/
└── pom.xml
```

### **Directory Breakdown:**

- **`src/main/java/`**: Contains the source code files including page objects, utilities, and constants.
- **`src/test/java/`**: Contains the test files with the actual test implementations.
- **`test-output/`**: Folder where test results are generated after execution.
- **`allure-results/`**: Folder where Allure stores results for report generation.
- **`pom.xml`**: Maven configuration file that manages project dependencies and plugins.

---

## Key Components

### **1. `LoginPage.java` (Page Object Model for Login Page)**

This class encapsulates the elements and actions on the login page, such as entering the username, password, and clicking the login button.

- Located in: `src/main/java/com/example/pages/LoginPage.java`
- **Annotations**: Uses `@FindBy` for element identification and `@Step` for Allure reporting.

### **2. `DriverManager.java` (WebDriver Management Utility)**

Responsible for managing the WebDriver lifecycle, initializing the WebDriver (Chrome or Firefox), and quitting the driver after tests.

- Located in: `src/main/java/com/example/utils/DriverManager.java`
- **Annotations**: Uses `@Step` to annotate WebDriver initialization and teardown for reporting.

### **3. `ConfigReader.java` (Configuration Reader)**

Handles reading configuration properties (like browser choice and timeouts) from a properties file.

- Located in: `src/main/java/com/example/utils/ConfigReader.java`

### **4. `Constants.java` (Constant Values for URLs and Timeouts)**

Contains constant values like the base URL, explicit wait time, implicit wait time, and test data.

- Located in: `src/main/java/com/example/constants/Constants.java`

### **5. `BaseTest.java` (Base Class for Setup and Teardown)**

Sets up and tears down the WebDriver before and after each test method.

- Located in: `src/test/java/com/example/tests/BaseTest.java`
- **Annotations**: Uses `@BeforeMethod` and `@AfterMethod` from TestNG.

### **6. `LoginTest.java` (Test Class for Login Functionality)**

Contains the actual test cases for login functionality. It verifies both successful and unsuccessful login attempts.

- Located in: `src/test/java/com/example/tests/LoginTest.java`
- **Annotations**: Uses `@Test`, `@Description`, and `@Story` for Allure integration.

### **7. `config.properties` (Configuration File for Browsers and Timeouts)**

A properties file that defines configurations such as the browser type and timeout values.

- Located in: `src/main/resources/config.properties`

### **8. `pom.xml` (Maven Configuration for Dependencies and Plugins)**

Defines project dependencies, including Selenium, TestNG, and Allure. It also configures plugins for running tests and generating Allure reports.

- Located in: `selenium-java-project/pom.xml`

### **9. Allure Report Generation**

To generate Allure reports after running tests:

1. Run the tests using Maven:
   ```
   mvn test
   ```
   
2. Generate the Allure report:
   ```
   mvn allure:serve
   ```
   This will open a browser displaying the Allure report with your test results.

   ```
   mvn allure:report
   ```
   This will generate a report in `allure-reports` folder

---

## How to Run the Project

1. **Clone the repository**:
   ```bash
   git clone https://github.com/dhirajks247/Selenium-Java-Boilerplate.git
   ```

2. **Install dependencies**:
   Navigate to the project directory and run:
   ```bash
   mvn clean install
   ```

3. **Run the tests**:
   Execute the tests using:
   ```bash
   mvn test
   ```

4. **Generate Allure report**:
   After the tests are executed, generate the Allure report with:
   ```bash
   mvn allure:serve
   ```
   This command will start a local server and open the Allure report in the browser.

---


This boilerplate provides a solid foundation for Selenium automation with Java and integrates Allure reporting for better test visualization. It follows the Page Object Model for maintainability and scalability and can be easily extended to suit larger projects.

Feel free to extend this structure with more page objects, utility classes, or test cases based on your requirements.

---
