package com.java.stream.problems.numbers;

import com.java.stream.problems.numbers.ignore.data.DummyData;
import com.java.stream.solutions.GeneralNumbersProblemSolution;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Remove duplicates from an arrayList.
 * */
class D_RemoveDuplicationFromListTest {

  @Test
  @Disabled
  void testRemoveDuplicationFromListTest() {
    final var input = DummyData.fakeListOfLongNumbers();
    var yourSolution = List.<Long>of();
    var mySolution = GeneralNumbersProblemSolution.getUniqueNumberFromList(input);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
