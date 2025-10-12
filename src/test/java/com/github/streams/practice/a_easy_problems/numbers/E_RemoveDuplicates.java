package com.github.streams.practice.a_easy_problems.numbers;

import com.github.streams.practice.a_easy_problems.numbers.data.DummyData;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Removes duplicates from a list of integers.
 *
 * <p><b>Input:</b> [1, 2, 2, 3, 4, 4, 5] <br>
 * <b>Output:</b> [1, 2, 3, 4, 5] <br>
 *
 * <p><b>Explanation:</b> Removes duplicate integers from a list.
 */
class E_RemoveDuplicates {

  @Test
  @Disabled
  void testRemoveDuplicationFromListTest() {
    final var input = DummyData.fakeListOfLongNumbers();
    var yourSolution = List.<Long>of();
    var mySolution = EasyNumbersProblemSolution.getUniqueNumberFromList(input);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
