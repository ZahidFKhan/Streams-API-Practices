package com.github.streams.practice.gatherers;

import java.util.List;
import java.util.stream.Gatherers;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;


class ScanTest {
  @Test
  @EnabledOnJre(JRE.JAVA_25)
  void scanTest() {
    final List<String> actual =
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
            .gather(Gatherers.scan(() -> "", (string, number) -> string + number))
            .toList();

    final List<String> expected =
        List.of("1", "12", "123", "1234", "12345", "123456", "1234567", "12345678", "123456789");
    Assertions.assertEquals(expected, actual);
  }
}
