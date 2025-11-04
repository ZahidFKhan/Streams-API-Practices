package com.github.streams.practice.gatherers;

import java.util.List;
import java.util.stream.Gatherers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

/// The windowFixed gatherer is an intermediate stream operation used to partition an input stream
// into a stream of non-overlapping, fixed-size lists (or "windows"). This is also commonly known as
// chunking or batching a stream.
///
/// The gatherer ensures that every element is consumed by exactly one window.
///
///
class WindowFixedTest {
  @Test
  @EnabledOnJre(JRE.JAVA_25)
  void windowFixedTest() {
    final List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8);
    final int windowSize = 2;

    final var output = input.stream().gather(Gatherers.windowFixed(windowSize)).toList();
    final var expected = List.of(List.of(1, 2), List.of(3, 4), List.of(5, 6), List.of(7, 8));

    Assertions.assertEquals(expected, output);
  }
}
