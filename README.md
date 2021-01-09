# HILTI UI Test Automation - Interview project

Following project is used as an interview evaluation tool. 
It consists of a common web UI test automation stack:

- Java 8
- Selenium 3.141.59
- Cucumber 4.7
- TestNG 6.14
- Maven 3.6

## Installation

Please make sure you have the following tools setup in your local environment:

#### Java 8

- JDK 8 https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
- JAVA_HOME environment variable should be set and point to JDK 8

#### Maven

Please make use you have maven 3 installed and available in your command line.
There are many ways to install maven locally:

- download [Maven](https://maven.apache.org/download.cgi) and add to PATH
- MAC: [Homebrew maven formula](https://formulae.brew.sh/formula/maven)
- Windows: [Chocolatey maven package](https://chocolatey.org/packages/maven)

You can verify the proper installation by executing the following command:
```bash
mvn --version
```

#### Verify local environment

This project contains some sample UI tests, which can be executed with the following command:
```bash
mvn test
```
And the result should be as follows:
```bash
Tests run: 5, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  01:07 min
[INFO] Finished at: 2019-12-05T15:09:53+01:00
[INFO] ------------------------------------------------------------------------
```

In case of any issues please go though installation guide above or check the Troubleshooting section.

## Project structure

#### Feature files

Gherkin feature files are located in the [resources/features](src/test/resources/features) directory.

#### Step classes

Cucumber steps definitions are located in [com.hilti.ta.steps](src/test/java/com/hilti/ta/steps) package.

#### Page Object Model

Pages and components definition can be found under [com.hilti.ta.pages](src/test/java/com/hilti/ta/pages) package.

#### Utility classes

Utility classes/enums (e.g. WebDriverFactory) can be found under [com.hilti.ta.utils](src/test/java/com/hilti/ta/utils) package.

#### TestNG runner

There is a single TestNG tests runner located in [com.hilti.ta](src/test/java/com/hilti/ta/RunCucumberTest.java) Cucumber options are defined on there.

#### Supported reporting

- XML: target/cucumber-report.xml
- JSON: target/cucumber-report.json
- cukes: target/cukes/index.html