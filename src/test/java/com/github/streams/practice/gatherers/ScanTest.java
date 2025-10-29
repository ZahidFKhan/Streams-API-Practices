package com.github.streams.practice.gatherers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

import java.util.stream.Gatherers;
import java.util.stream.Stream;

class ScanTest {
    @Test
    @EnabledOnJre(JRE.JAVA_25)
    void scan() {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
                .gather(Gatherers.windowFixed(3)).toList();
    }
}
