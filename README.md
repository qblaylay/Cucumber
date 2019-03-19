# Cucumber with Serenity

[![](http://static1.squarespace.com/static/5b64cabf5b409bbf05dbd8b3/t/5b6571f11ae6cf3410e9e52b/1533374966496/cucumber-black-512.png?format=500w)](https://cucumber.io/)

A sample project for Cucumber test which is using Serenity Report

Cucumber is a testing approach which supports;
- Behavior Driven Development (BDD). 
- It explains the behavior of the application in a simple English text using Gherkin language.

# Project structure
The directory structure of the sample project looks like the following.
```sh
+---.idea
\---test
|   +---java
|   |   \---pages
|   |   |   \---enrol
|   |   |   \---facebook
|   |   |   \---home
|   |   |   \---myAccount
|   |   \---stepdefs
|   |   |   |---Stepdefs.java
|   |   \---steps.serenity
|   |   |   \---N11Steps.java
|   |   \---utils
|   |   |---RunCucumberTest.java
|   \---resources
|       \---features
|       |   |---enrolment
|       |   |   |---enrol_to_n11_via_facebook.feature
|       |   |---home
|       \---webdriver.windows
|       \---serenity.conf
|---pom.xml
|---serenity.properties
```
### Use Maven
Open a command window and run:
```sh
    $ mvn verify
```

### Reports
The directory of the executed report in the following path;
 -  target/site/serenity/index.html
