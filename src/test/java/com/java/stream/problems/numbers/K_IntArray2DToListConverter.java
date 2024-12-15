package com.java.stream.problems.numbers;

import com.java.stream.problems.numbers.ignore.data.DummyData;
import com.java.stream.solutions.GeneralNumbersProblemSolution;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class K_IntArray2DToListConverter {
  @Test
  void convertInt2DArrayToList() {
    final int[][] input = DummyData.random2DPrimitiveArray();

    var mySolution = GeneralNumbersProblemSolution.convertInt2DArrayToList(input);
    var yourSolution = List.of(List.<Integer>of());

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
