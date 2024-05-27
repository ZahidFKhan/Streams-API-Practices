package com.java.stream.general_problems.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.java.stream.solutions.GeneralProblemsSolution;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class SecondHighestWordTest {
  @Test
  @Disabled()
  public void find2ndHighestWord() {
    final String input = "I am interested123455 to grow in my organization";
    String expected = GeneralProblemsSolution.find2ndLargestWordInTheString(input);

    final String actual = "";

    assertEquals(expected, actual);
  }

}
