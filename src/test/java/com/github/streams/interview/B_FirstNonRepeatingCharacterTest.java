package com.github.streams.interview;

import com.github.streams.solutions.InterviewProblemSolutions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Q17.  Given a String find the first non-repeating character:
 *
 * String = The quick brown fox jumps over the lazy dog, find the first non-repeated character.
 * (Google interview)
 */
class B_FirstNonRepeatingCharacterTest {

  @Test
  @Disabled
  void testFirstNonRepeatingCharacter() {
    final var input =
        "The quick brown fox jumps over the lazy dog, find the first non repeated character.";
    final var yourSolution = ' ';
    final var mySolution = InterviewProblemSolutions.firstNonRepeatingCharacter(input);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
