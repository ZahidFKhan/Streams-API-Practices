module com.github.streams {
  requires org.junit.jupiter;
  requires javafaker;

  opens com.github.streams.interview to
      org.junit.platform.commons;
  opens com.github.streams.learn to
      org.junit.platform.commons;
  opens com.github.streams.problems.strings to
      org.junit.platform.commons;
  opens com.github.streams.problems.numbers to
      org.junit.platform.commons;
  opens com.github.streams.solutions to
      org.junit.platform.commons;
  opens com.github.streams.solutions.learn_solutions to
      org.junit.platform.commons;
}
