package com.github.streams.practice.a_easy_problems.numbers;

import com.github.streams.practice.a_easy_problems.numbers.data.DummyData;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class K_IntArray2DToListConverter {
  @Test
  @Disabled
  void convertInt2DArrayToList() {
    final int[][] input = DummyData.random2DPrimitiveArray();

    var mySolution = EasyNumbersProblemSolution.convertInt2DArrayToList(input);
    var yourSolution = List.of(List.<Integer>of());

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
