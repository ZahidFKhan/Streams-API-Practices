package com.github.streams.learn.default_methods;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

///
// Replace every word in the list with its upper case equivalent.
///
class D_ListDefaultMethod {

  @Test
  @Disabled
  void upperCaseAllWords() {
    final var list = Arrays.asList("alfa", "bravo", "charlie", "delta", "echo", "foxtrot");

    var mySolution = DefaultMethodSolutions.upperCaseAllWords(list);
    var yourSolution = List.of();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
