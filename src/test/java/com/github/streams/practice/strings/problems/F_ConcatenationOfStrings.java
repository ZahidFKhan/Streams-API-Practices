package com.github.streams.practice.strings.problems;

import com.github.streams.practice.strings.StringProblemsSolution;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class F_ConcatenationOfStrings {
  /**
   * Given a list of strings, write a method to concatenate all the strings in the list, separated
   * by a comma, using Java 8 Streams.
   */
  @Test
  @Disabled
  void testConcatenationOfStrings() {
    List<String> input = List.of("Hellow", "World", "Hello", "World");
    final var mySolution = StringProblemsSolution.concatenateStrings(input);
    final var yourSolution = "";

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
