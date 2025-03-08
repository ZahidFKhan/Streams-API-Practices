package com.github.streams.practice.numbers.problems;

import com.github.streams.practice.numbers.NumbersProblemSolution;
import com.github.streams.practice.numbers.problems.ignore.data.DummyData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Tests the sumOfDigits method in the GeneralNumbersProblemSolution class.
 *
 * <p>This test case generates a random integer between 1 and the maximum possible integer value,
 * passes it to the sumOfDigits method, and verifies that the result is correct.
 *
 * <p>Note: This test case is currently disabled and should be updated to reflect the correct
 * expected behavior.
 *
 * @see NumbersProblemSolution#sumOfDigits(int)
 */
class C_SumOfDigits {

  @Test
  @Disabled
  void testSumOfDigits() {
    final var input = DummyData.fakerNumber();
    var mySolution = NumbersProblemSolution.sumOfDigits(input);
    var yourSolution = 2;

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
