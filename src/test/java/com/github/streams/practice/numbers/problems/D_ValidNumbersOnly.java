package com.github.streams.practice.numbers.problems;

import com.github.streams.practice.numbers.NumbersProblemSolution;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Extracts integers from a list of strings. <br>
 * <br>
 * Example:<br>
 * Input: ["as", "123",* "32", "2as"]<br>
 * Output: [123, 32]<br>
 * Explanation: Parses strings as integers and returns a list of valid integers.
 */
class D_ValidNumbersOnly {
  @Test
  @Disabled
  void testCheckAllIntegersWithoutAlphabets() {
    final var input = List.of("1", "12", "12a", "a12");
    var yourSolution = List.of();
    var mySolution = NumbersProblemSolution.getNumberOnly(input);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
