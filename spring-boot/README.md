# spring-boot

## Description

A spring boot web application project.

- plugins
  - java
  - spring-boot
  - checkstyle
  - findbugs
  - jacoco

- custom tasks
  - initDirs
  - copyProfileResource<ProfileName>

- dependencies
  - spring-boot
  - slf4j
  - logback-classic
  - junit
  - mockito

## Requirements

- Java 8
- Gradle 2.1+

## Usage

```
$ gradle --daemon tasks
:tasks

------------------------------------------------------------
All tasks runnable from root project
------------------------------------------------------------

Application tasks
-----------------
bootRun - Run the project with support for auto-detecting main class and reloading static resources
installApp - Installs the project as a JVM application along with libs and OS specific scripts.
run - Runs this project as a JVM application

Build tasks
-----------
assemble - Assembles the outputs of this project.
bootRepackage - Repackage existing JAR and WAR archives so that they can be executed from the command line using 'java -jar'
build - Assembles and tests this project.
buildDependents - Assembles and tests this project and all projects that depend on it.
buildNeeded - Assembles and tests this project and all projects it depends on.
classes - Assembles classes 'main'.
integrationTestClasses - Assembles classes 'integrationTest'.
jar - Assembles a jar archive containing the main classes.
testClasses - Assembles classes 'test'.

Build Setup tasks
-----------------
init - Initializes a new Gradle build. [incubating]
wrapper - Generates Gradle wrapper files. [incubating]

Distribution tasks
------------------
assembleMainDist - Assembles the main distributions
distTar - Bundles the project as a distribution.
distZip - Bundles the project as a distribution.
installDist - Installs the project as a distribution as-is.

Documentation tasks
-------------------
javadoc - Generates Javadoc API documentation for the main source code.

Help tasks
----------
components - Displays the components produced by root project 'spring-boot'. [incubating]
dependencies - Displays all dependencies declared in root project 'spring-boot'.
dependencyInsight - Displays the insight into a specific dependency in root project 'spring-boot'.
help - Displays a help message.
model - Displays the configuration model of root project 'spring-boot'. [incubating]
projects - Displays the sub-projects of root project 'spring-boot'.
properties - Displays the properties of root project 'spring-boot'.
tasks - Displays the tasks runnable from root project 'spring-boot'.

Verification tasks
------------------
check - Runs all checks.
clean - Deletes the build directory.
integrationTest - Runs the integration tests.
test - Runs the unit tests.

Other tasks
-----------
checkstyleIntegrationTest - Run Checkstyle analysis for integrationTest classes
checkstyleTest - Run Checkstyle analysis for test classes
dependencyManagement
findbugsIntegrationTest - Run FindBugs analysis for integrationTest classes
findbugsTest - Run FindBugs analysis for test classes
initDirs - Creates 'java' and 'resources' directories under all sourceSets
jacocoTestReport

Rules
-----
Pattern: clean<TaskName>: Cleans the output files of a task.
Pattern: build<ConfigurationName>: Assembles the artifacts of a configuration.
Pattern: upload<ConfigurationName>: Assembles and uploads the artifacts belonging to a configuration.
Pattern: copyProfileResource<ProfileName>: Copies the resource files of a profile.

```

## Contributing

1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request :D

## License

MIT
