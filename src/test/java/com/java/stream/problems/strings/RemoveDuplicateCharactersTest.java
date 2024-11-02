package com.java.stream.problems.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.java.stream.solutions.GeneralProblemsSolution;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class RemoveDuplicateCharactersTest {
  @Test
  @Disabled()
  public void testRemoveDuplicates() {
    final String input = "dabfcadef";
    final String yourSolution = "";
    final String expected = GeneralProblemsSolution.getUniqueCharacters(input);

    assertEquals(expected, yourSolution);
  }
}
