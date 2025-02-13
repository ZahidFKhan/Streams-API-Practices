package com.github.streams.problems.numbers;

import com.github.streams.problems.numbers.ignore.data.DummyData;
import com.github.streams.solutions.GeneralNumbersProblemSolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Given a numeric array , re arrange the elements to form a highest possible value.
 * Input:  {1, 34, 3, 98, 9, 76, 45, 4};
 * Output: 998764543431
 * Explanation: 9,98,76,45,4,34,3,1
 * */
class C_SortElementInDecendingOrderTest {

  @Test
  @Disabled
  public void test() {
    var input = DummyData.fakeList();
    var mySolution = GeneralNumbersProblemSolution.getHighestPossibleValue(input);
    var yourSolution = "";

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
