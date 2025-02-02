package com.github.streams.problems.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.streams.solutions.GeneralStringProblemsSolution;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class I_SecondHighestWordTest {
  @Test
  @Disabled()
  public void find2ndHighestWord() {
    final String input = "I am interested123455 to grow in my organization";
    String mySolution = GeneralStringProblemsSolution.find2ndLargestWordInTheString(input);

    final String yourSolution = "";

    assertEquals(mySolution, yourSolution);
  }

}
