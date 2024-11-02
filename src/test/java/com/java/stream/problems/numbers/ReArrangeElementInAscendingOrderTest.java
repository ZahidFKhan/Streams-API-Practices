package com.java.stream.problems.numbers;

import com.java.stream.solutions.GeneralProblemsNumbersSolution;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Given a numeric array , re arrange the elements to form a smallest possible value.
 *
 * input is: int arr[] = {1, 34, 3, 98, 9, 76, 45, 4};
 *
 * output is: 133444576998
 *
 * Explanation: 1,3,34,4,45,76,9,98
 * */
public class ReArrangeElementInAscendingOrderTest {

  @Test
  @Disabled
  public void test() {
    var input = List.of(1, 34, 3, 98, 9, 76, 45, 4);
    var expected = GeneralProblemsNumbersSolution.getSmallestPossibleValue(input);
    var yourSolution = "";

    Assertions.assertEquals(expected, yourSolution);
  }
}
