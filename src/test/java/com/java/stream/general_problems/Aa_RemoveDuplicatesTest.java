package com.java.stream.general_problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import com.java.stream.solutions.GeneralProblemsSolution;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Aa_RemoveDuplicatesTest {
  @Test
  @Disabled()
  public void testRemoveDuplicates() {
    final String input = "dabfcadef";
    final String actual = "";
    final String expected = GeneralProblemsSolution.getUniqueCharacters(input);

    assertEquals(expected, actual);
  }
}
