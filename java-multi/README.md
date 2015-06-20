# java-multi

## Description

A multi java application project.

- 'master': root project
- 'lib': sub project
- 'app': sub project that depends on 'lib'

## Requirements

- Java 8
- Gradle 2.1+

## Usage

```
$ cd master
$ gradle --daemon tasks
:tasks

------------------------------------------------------------
All tasks runnable from root project
------------------------------------------------------------

Default tasks: build

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

Fat JAR tasks
-------------
fatJar - Assembles the fat JAR
fatJarPrepareFiles - Prepare files for the fat JAR

Help tasks
----------
components - Displays the components produced by root project 'master'. [incubating]
dependencies - Displays all dependencies declared in root project 'master'.
dependencyInsight - Displays the insight into a specific dependency in root project 'master'.
help - Displays a help message.
model - Displays the configuration model of root project 'master'. [incubating]
projects - Displays the sub-projects of root project 'master'.
properties - Displays the properties of root project 'master'.
tasks - Displays the tasks runnable from root project 'master' (some of the displayed tasks may belong to subprojects).

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
findbugsIntegrationTest - Run FindBugs analysis for integrationTest classes
findbugsTest - Run FindBugs analysis for test classes
initDirs - Creates 'java' and 'resources' directories under all sourceSets
jacocoTestReport

```

## Contributing

1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request :D

## License

MIT
