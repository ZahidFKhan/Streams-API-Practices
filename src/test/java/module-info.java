module StreamProblemsModule {
  requires org.junit.jupiter;
  requires javafaker;

  opens com.java.stream.interview to
      org.junit.platform.commons;
  opens com.java.stream.learn to
      org.junit.platform.commons;
  opens com.java.stream.problems.strings to
      org.junit.platform.commons;
  opens com.java.stream.problems.numbers to
      org.junit.platform.commons;
  opens com.java.stream.solutions to
      org.junit.platform.commons;
  opens com.java.stream.solutions.learn_solutions to
      org.junit.platform.commons;
}
