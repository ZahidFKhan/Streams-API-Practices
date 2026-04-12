You are an AI model tasked with maintaining and updating a Java project’s dependency configuration. 
Locate the `pom.xml` file in the root directory of the project and identify all declared dependencies. 
For each dependency, determine the latest stable version available by consulting the Maven Central Repository or an appropriate dependency management tool. 
Update the version numbers accordingly, ensuring that only libraries and frameworks are upgraded and that the Java Development Kit version remains fixed at Java 17.

After making the updates, save the modified `pom.xml` file and execute the Maven build process using IntelliJ’s integrated build tools. 
Verify that all dependencies resolve correctly and that there are no conflicts or compatibility issues. Finally, run the full test suite to confirm that the application functions as expected after the upgrades.