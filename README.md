
# Selenium Automation Project

## Table of Contents
- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Setup Instructions](#setup-instructions)
- [Test Cases](#test-cases)
  - [1. Sign Up](#1-sign-up)
  - [2. Sign In](#2-sign-in)
  - [3. Add to Cart](#3-add-to-cart)
  - [4. Place an Order](#4-place-an-order)
- [Running the Tests](#running-the-tests)

## Overview
This project contains automated test cases for the following functionalities on Amazon.in:
- Sign Up
- Sign In
- Add to Cart
- Place an Order

These test cases are written in Java using Selenium WebDriver, allowing for efficient testing of web applications.

## Prerequisites
Before you begin, ensure you have the following installed:
- Java Development Kit (JDK)
- Apache Maven (for managing dependencies)
- Chrome WebDriver (ensure it matches your Chrome browser version)

## Setup Instructions
1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd <repository-folder>
   ```

2. **Install dependencies:**
   If you are using Maven, add the following dependencies in your `pom.xml`:
   ```xml
   <dependencies>
       <dependency>
           <groupId>org.seleniumhq.selenium</groupId>
           <artifactId>selenium-java</artifactId>
           <version>4.x.x</version> <!-- Replace with the latest version -->
       </dependency>
       <!-- Add other dependencies as needed -->
   </dependencies>
   ```

3. **Set up the WebDriver:**
   Ensure the ChromeDriver is in your system's PATH or specify its path in the test code.

## Test Cases

### 1. Sign Up
- **Objective:** Test the user registration process.
- **Steps:**
  1. Navigate to the sign-up page.
  2. Fill in the required information (name, email, password, etc.).
  3. Submit the registration form.

### 2. Sign In
- **Objective:** Test the user login process.
- **Steps:**
  1. Navigate to the Home page.
  2. Click on Sign In
  3. Enter registered email.
  4. Click on continue
  5. Enter password.
  7. Click the sign-in button.
  8. Verify successful login.

### 3. Add to Cart
- **Objective:** Test adding a product to the cart.
- **Steps:**
  1. Search for a product.
  2. Click on the product to view details.
  3. Click the "Add to Cart" button.

### 4. Place an Order
- **Objective:** Test the order placement process.
- **Steps:**
  1. Go to the cart.
  2. Click on the "Proceed to Checkout" button.
  3. Select the necessary payment and shipping details.
  4. Submit the order.
  5. Verify order confirmation.



## Running the Tests
You can run the tests using your IDE or by executing the Maven command:
```bash
mvn test
```

