package com.java.stream.interview;

import com.java.stream.solutions.InterviewProblemSolutions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Q17.  Given a String find the first non-repeating character:
 *
 * String = The quick brown fox jumps over the lazy dog, find the first non-repeated character.
 * (Google interview)
 */
class FirstNonRepeatingCharacterTest {

  @Test
  @Disabled
  void testFirstNonRepeatingCharacter() {
    final var input =
        "The quick brown fox jumps over the lazy dog, find the first non repeated character.";
    final var yourSolution = ' ';
    final var expected = InterviewProblemSolutions.firstNonRepeatingCharacter(input);

    Assertions.assertEquals(expected, yourSolution);
  }
}
