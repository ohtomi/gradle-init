# java-single

## Description

A single java application project.

- plugins
  - java
  - application
  - fatjar

- custom tasks
  - initDirs

- dependencies
  - slf4j
  - logback-clasic
  - junit

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
installApp - Installs the project as a JVM application along with libs and OS specific scripts.
run - Runs this project as a JVM application

Build tasks
-----------
assemble - Assembles the outputs of this project.
build - Assembles and tests this project.
buildDependents - Assembles and tests this project and all projects that depend on it.
buildNeeded - Assembles and tests this project and all projects it depends on.
classes - Assembles classes 'main'.
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

Fat JAR tasks
-------------
fatJar - Assembles the fat JAR
fatJarPrepareFiles - Prepare files for the fat JAR

Help tasks
----------
components - Displays the components produced by root project 'java-single'. [incubating]
dependencies - Displays all dependencies declared in root project 'java-single'.
dependencyInsight - Displays the insight into a specific dependency in root project 'java-single'.
help - Displays a help message.
model - Displays the configuration model of root project 'java-single'. [incubating]
projects - Displays the sub-projects of root project 'java-single'.
properties - Displays the properties of root project 'java-single'.
tasks - Displays the tasks runnable from root project 'java-single'.

Verification tasks
------------------
check - Runs all checks.
clean - Deletes the build directory.
test - Runs the unit tests.

Other tasks
-----------
initDirs - Creates 'java' and 'resources' directories under all sourceSets

Rules
-----
Pattern: clean<TaskName>: Cleans the output files of a task.
Pattern: build<ConfigurationName>: Assembles the artifacts of a configuration.
Pattern: upload<ConfigurationName>: Assembles and uploads the artifacts belonging to a configuration.

```

## Contributing

1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request :D

## License

MIT
