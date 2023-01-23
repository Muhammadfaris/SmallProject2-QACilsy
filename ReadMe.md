## SmallProject2-QACilsy

Website to test : http://qa.cilsy.id:8080/


## About the project

Hotel Dominic Parks is a reservation website specifically Hotel.
This project covers several function for UI testing:

* Sign Up Flow
* Log In Page Features
* Home Page Features
* Booking Flow
* Hotel Page Features 

## Framework

* Java & Maven
* Selenium : https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
* Cucumber : https://mvnrepository.com/artifact/io.cucumber/cucumber-testng

## Running Test

* Open runner file and make sure the tag is @regression
* Then write **mvn clean verify** in your IDE terminal
* Then go to cucumber report on :
  - [**target/cucumber-report-html**](target/cucumber-report-html/cucumber-html-reports/feature-overview.html)
