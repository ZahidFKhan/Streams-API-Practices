Go to the file "pom.xml" in the root directory of your project. 
Update the version numbers of the dependencies to the latest versions available. 
You can check for the latest versions on the Maven Central Repository or by using a dependency management tool. 
After updating the versions, save the "pom.xml" file and run IntelliJ build tool (Maven) to ensure that all dependencies are correctly resolved and there are no compatibility issues.
Make sure to run your tests after upgrading the dependencies to verify that everything is working as expected.
Ensure you're not upgrading the version of the JDK itself, as the project is specifically set up for Java 17. Only update the versions of the libraries and frameworks used in the project.