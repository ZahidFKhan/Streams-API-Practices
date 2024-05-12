package com.java.stream.interview_problems;

import com.github.javafaker.Faker;
import com.java.stream.solutions.InterviewProblemSolutions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Given a string,
 * Find the highest number of vowels present in a word.
 *
 * Example:
 * INPUT: HELLO HOW ARE YOU
 * OUTPUT: 2
 * EXPLANATION: HELLO contains 2 vowels.
 * */
public class WordWithMaxNumberOfVowelsTest {

  @Disabled
  @Test
  void testNumberOfVowels() {
    var input = Faker.instance().chuckNorris().fact();
    final var expected = InterviewProblemSolutions.maxNumberOfVowels(input);
    final var actual = 0;
    Assertions.assertEquals(expected, actual);
  }
}
