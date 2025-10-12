package com.github.streams.practice.a_easy_problems.strings;

import com.github.streams.practice.b_medium_problems.ProblemSolutions;
import net.datafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Given A String
 * Find the highest number of vowels present in a word.
 *
 * Example:
 * INPUT: HELLO HOW ARE YOU
 * OUTPUT: 2
 * EXPLANATION: HELLO contains 2 vowels.
 * */
class P_WordWithMaxNumberOfVowelsTest {

  @Disabled
  @Test
  void testNumberOfVowels() {
    var input = new Faker().chuckNorris().fact();
    final var mySolution = ProblemSolutions.maxNumberOfVowels(input);
    final var yourSolution = 0;
    Assertions.assertEquals(mySolution, yourSolution);
  }
}
