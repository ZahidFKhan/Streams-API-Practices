module com.github.streams {
  requires org.junit.jupiter;
  requires org.junit.platform.commons;
  requires net.datafaker;

  //  INTERVIEW
  opens com.github.streams.interview.problems.numbers to
      org.junit.platform.commons;
  opens com.github.streams.interview.problems.strings to
      org.junit.platform.commons;
  opens com.github.streams.interview.problems.employee to
      org.junit.platform.commons;
  opens com.github.streams.interview to
      org.junit.platform.commons;

  //  LEARN
  opens com.github.streams.learn.ignore.inprogress to
      org.junit.platform.commons;
  opens com.github.streams.learn.functional_interfaces to
      org.junit.platform.commons;
  opens com.github.streams.learn.solutions to
      org.junit.platform.commons;
  opens com.github.streams.learn.default_methods to
      org.junit.platform.commons;

  //  PRACTICE
  opens com.github.streams.practice.strings to
      org.junit.platform.commons;
  opens com.github.streams.practice.numbers to
      org.junit.platform.commons;
  opens com.github.streams.practice.numbers.problems to
      org.junit.platform.commons;
  opens com.github.streams.practice.strings.problems to
      org.junit.platform.commons;
}
