package com.github.streams.practice.b_medium.strings.problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.streams.practice.b_medium.strings.StringProblemsSolution;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class G_RemoveDuplicateCharactersTest {
  @Test
  @Disabled()
  public void testRemoveDuplicates() {
    final String input = "dabfcadef";
    final String yourSolution = "";
    final String mySolution = StringProblemsSolution.getUniqueCharacters(input);

    assertEquals(mySolution, yourSolution);
  }
}
