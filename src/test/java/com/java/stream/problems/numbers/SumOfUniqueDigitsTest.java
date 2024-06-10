package com.java.stream.problems.numbers;

import com.java.stream.solutions.GeneralProblemsNumbersSolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

/*
 * Given an array of {5,6,7,8,5,5,8,8,7)
 *  find the sum of the unique elements.
 * The output should be in this case is: 26.
 */
public class SumOfUniqueDigitsTest {

  @Test
  @Disabled
  void testSumOfUniqueDigitsTest() {
    final var input = List.of(5, 6, 7, 8, 5, 5, 8, 8, 7);
    var expected = GeneralProblemsNumbersSolution.sumOfDigits(input);
    var actual = List.of();

    Assertions.assertEquals(expected, actual);
  }
}
