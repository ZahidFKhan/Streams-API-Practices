package com.java.stream.problems.strings;

import com.java.stream.solutions.GeneralStringProblemsSolution;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class K_FindDuplicateStrings {
  @Test
  void findDuplicateStrings() {
    final var input = List.of("Hellow", "World", "How", "are", "you", "How", "are", "you");
    final var mySolution = GeneralStringProblemsSolution.findDuplicateStrings(input);
    final var yourSolution = List.of();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
