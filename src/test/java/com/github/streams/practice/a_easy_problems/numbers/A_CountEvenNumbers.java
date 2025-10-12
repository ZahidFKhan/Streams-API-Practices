package com.github.streams.practice.a_easy_problems.numbers;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Count even numbers:
 *
 * <p>Example: <br>
 * Input = [1,2,3,4,5,6]<br>
 * Output = 3 <br>
 * Explanation: (1, 2, 3) are even numbers.
 */
class A_CountEvenNumbers {

  @Test
  @Disabled
  void countEvenNumbers() {
    final var input = List.of(1, 2, 3, 4, 5, 6, 7, 8);

    final var mySolution = EasyNumbersProblemSolution.countNumberOfEvenNumbers(input);
    final var yourSolution = -1L; // WRITE YOUR IMPLEMENTATION HERE//

    Assertions.assertEquals(
        mySolution,
        yourSolution,
        "Your solution is incorrect - you can refer to mySolution above to check, how I have done the same problem.");
  }
}
