# Selenide Tests

This project contains automated tests using Selenide framework to validate certain functionalities of a web application.

## Getting Started

These instructions will help you get a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java JDK 8 or higher installed
- Maven installed

### Installing

1. Clone the repository:
`git clone https://github.com/Yeshzhanova/wikipedia.git
`

2. Navigate to the project directory:

`cd wikipedia
`

3. Build the project using Maven:

`mvn clean install
`
## Running the Tests

To run the tests, execute the following command in the project directory:

`mvn test
`

The tests will be executed, and the results will be displayed in the console.

## Project Structure

The project follows the standard Maven project structure:

- `src/main/java`: Contains the main Java source files
- `src/test/java`: Contains the test Java source files
- `src/test/resources`: Contains test resources such as test data, configuration files, etc.

## Test Classes

- `ArticleParagraphsTest`: Tests the existence of paragraphs on the Wikipedia page.
- `ChangeLanguageTest`: Tests the language change functionality on the Wikipedia page.
- `CodeViewLinkTest`: Tests the return to the main page link on the Wikipedia page.

## Built With

- Selenide - A concise UI testing library for Java
- JUnit 5 - A testing framework for Java applications
- Maven - A build automation tool for Java projects

## Authors

- @https://github.com/Yeshzhanova
