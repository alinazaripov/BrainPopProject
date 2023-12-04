# BrainPopProject

#Overview

This project is designed to automate testing for BrainPOP using a Selenium-based BDD framework.
Prerequisites
* Java installed
* Maven installed
* ChromeDriver installed and added to the system PATH
* Git installed (for cloning the repository

#Getting Started

1. Clone the Repository:
git clone https://github.com/alinazaripov/BrainPopProject.git

2. Configure Properties:
* Open src/test/resources/config.properties and update the configuration settings such as brainPopUrl, username, and password.

3. Run Tests:
Execute tests using Maven:

mvn clean test

#Test Reports
* Test reports are generated in the target directory.
* Open target/cucumber-reports/index.html to view the Cucumber HTML report.

Contributors
Alina Zaripova
