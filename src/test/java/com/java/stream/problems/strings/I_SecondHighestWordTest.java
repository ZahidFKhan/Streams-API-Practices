package com.java.stream.problems.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.java.stream.solutions.GeneralStringProblemsSolution;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class I_SecondHighestWordTest {
  @Test
  @Disabled()
  public void find2ndHighestWord() {
    final String input = "I am interested123455 to grow in my organization";
    String mySolution = GeneralStringProblemsSolution.find2ndLargestWordInTheString(input);

    final String yourSolution = "";

    assertEquals(mySolution, yourSolution);
  }

}
