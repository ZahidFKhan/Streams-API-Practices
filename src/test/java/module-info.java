module com.github.streams {
  requires org.junit.jupiter;
  requires org.junit.platform.commons;
  requires net.datafaker;
  requires static lombok;

  // LEARN
  opens com.github.streams.practice.functional_interfaces to
      org.junit.platform.commons;
  opens com.github.streams.practice.functional_interfaces.solutions to
      org.junit.platform.commons;

  // PRACTICE EASY
  opens com.github.streams.practice.a_easy_problems.numbers to
      org.junit.platform.commons;
  opens com.github.streams.practice.a_easy_problems.strings to
      org.junit.platform.commons;
  opens com.github.streams.practice.b_medium_problems.employee to
      org.junit.platform.commons;
//  opens com.github.streams.practice.gatherers to
//      org.junit.platform.commons;

  //  PRACTICE MEDIUM
  opens com.github.streams.practice.b_medium_problems.strings to
      org.junit.platform.commons;
  opens com.github.streams.practice.b_medium_problems.numbers to
      org.junit.platform.commons;
  opens com.github.streams.practice.b_medium_problems.numbers.data to
      org.junit.platform.commons;
  opens com.github.streams.practice.b_medium_problems to
      org.junit.platform.commons;

  // PRACTICE HARD
  opens com.github.streams.practice.c_hard_problems.numbers to
      org.junit.platform.commons;
}
