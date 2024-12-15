package com.java.stream.problems.numbers;


import com.java.stream.problems.numbers.ignore.data.DummyData;
import com.java.stream.solutions.GeneralNumbersProblemSolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Tests the sumOfDigits method in the GeneralNumbersProblemSolution class.
 *
 * This test case generates a random integer between 1 and the maximum possible integer value,
 * passes it to the sumOfDigits method, and verifies that the result is correct.
 *
 * Note: This test case is currently disabled and should be updated to reflect the correct expected behavior.
 *
 * @see GeneralNumbersProblemSolution#sumOfDigits(int)
 */
class H_SumOfDigitsTest {

  @Test
  @Disabled
  void testSumOfDigits() {
    final var input = DummyData.fakerNumber();
    var mySolution = GeneralNumbersProblemSolution.sumOfDigits(input);
    var yourSolution = 2;

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
