package com.github.streams.practice.a_easy_problems.strings;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class K_FindDuplicateStrings {
  @Test
  @Disabled
  void findDuplicateStrings() {
    final var input = List.of("Hellow", "World", "How", "are", "you", "How", "are", "you");
    final var mySolution = StringProblemsSolution.findDuplicateStrings(input);
    final var yourSolution = List.of();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
