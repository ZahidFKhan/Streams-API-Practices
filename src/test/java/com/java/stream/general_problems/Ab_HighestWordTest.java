package com.java.stream.general_problems;

import com.java.stream.solutions.GeneralProblemsSolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Ab_HighestWordTest {
  @Test
  @Disabled()
  public void findLargestWordInTheString() {
    final String input = "I am interested123455 to grow in my organization";
    final String expected = GeneralProblemsSolution.findLargestWordInTheString(input);

    String actual = null;

    Assertions.assertEquals(expected, actual);
  }
}
