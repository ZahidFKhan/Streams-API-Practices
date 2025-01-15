package com.java.stream.problems.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.java.stream.solutions.GeneralStringProblemsSolution;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class G_RemoveDuplicateCharactersTest {
  @Test
  @Disabled()
  public void testRemoveDuplicates() {
    final String input = "dabfcadef";
    final String yourSolution = "";
    final String mySolution = GeneralStringProblemsSolution.getUniqueCharacters(input);

    assertEquals(mySolution, yourSolution);
  }
}
