package com.java.stream.problems.strings;

import com.java.stream.solutions.GeneralStringProblemsSolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class B_LargestWordTest {
  /**
   * Find the largest word in a given string.
   * <br>
   * <br>
   * Example string:
   *
   * <pre>
   * Input: "I am interested123455 to grow in my organization"
   * Output: "interested123455"
   * </pre>
   *
   * @author ZahidKhan
   *
   * @see GeneralStringProblemsSolution#findLargestWordInTheString(String)
   */
  @Test
//  @Disabled()
  public void findLargestWordInTheString() {
    final String input = "I am interested123455 to grow in my organization";
//    final String mySolution = GeneralStringProblemsSolution.findLargestWordInTheString(input);
    final String mySolution = this.findLargestWordInTheString(input);

    String yourSolution = "interested123455";

    Assertions.assertEquals(mySolution, yourSolution);
  }

  private String findLargestWordInTheString(String input) {
    return Arrays.stream(input.split(" ")).max(Comparator.comparing(String::length)).get();
  }
}
