package com.github.streams.practice.numbers.problems;

import com.github.streams.practice.numbers.NumbersProblemSolution;
import com.github.streams.practice.numbers.problems.ignore.data.DummyData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Given a numeric array , re arrange the elements to form a highest possible value.
 * Input:  {1, 34, 3, 98, 9, 76, 45, 4};
 * Output: 998764543431
 * Explanation: 9,98,76,45,4,34,3,1
 * */
class G_DescendingNumberValue {

  @Test
  @Disabled
  public void test() {
    var input = DummyData.fakeList(7);
    var mySolution = NumbersProblemSolution.getHighestPossibleValue(input);
    var yourSolution = "";

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
