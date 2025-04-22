package com.github.streams.practice.numbers.problems;

import com.github.streams.practice.numbers.NumbersProblemSolution;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Re-arranges the elements of a numeric array to form the smallest possible value.
 *
 * <p>Example: Input: [1, 34, 3, 98, 9, 76, 45, 4] <br>
 * Output: 133444576998
 *
 * <p>Explanation: The numbers are re-arranged in ascending order, with single-digit numbers placed
 * before multi-digit numbers like [1,3,34,4,45,76,9,98].
 */
class F_AscendingNumberValue {

  @Test
  @Disabled
  public void test() {
    var input = List.of(1, 34, 3, 98, 9, 76, 45, 4);
    var mySolution = NumbersProblemSolution.getSmallestPossibleValue(input);
    var yourSolution = "";

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
