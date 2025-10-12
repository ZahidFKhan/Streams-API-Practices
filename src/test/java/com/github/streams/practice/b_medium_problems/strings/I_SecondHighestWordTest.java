package com.github.streams.practice.b_medium_problems.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class I_SecondHighestWordTest {
  @Test
  @Disabled()
  public void find2ndHighestWord() {
    final String input = "I am interested123455 to grow in my organization";
    String mySolution = StringProblemsSolution.find2ndLargestWordInTheString(input);

    final String yourSolution = "";

    assertEquals(mySolution, yourSolution);
  }
}
