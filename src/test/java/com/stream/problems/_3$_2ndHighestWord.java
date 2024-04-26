package com.stream.problems;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3$_2ndHighestWord {
    @Test
    @Disabled()
    public void find2ndHighestWord() {
        final String input = "I am interested123455 to grow in my organization";
        final String expectedOutput = "organization";

        String actualOutput = "<PUT YOUR LOGIC HERE>";;

        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput, actualOutput);
    }

    private void solution1() {
        Arrays.stream("somevalues".split("")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();
    }
}
