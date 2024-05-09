package com.stream.problems;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Aa_RemoveDuplicates {
    @Test
    @Disabled()
    public void testRemoveDuplicates() {
        final String input = "dabfcadef";
        final String expectedOutput = "dabfce";

        // Implement the logic to remove duplicates from the string
        String actualOutput = input.chars().distinct()
                .mapToObj(x->(char)x)
                .reduce("",(x, y)->x +  y,(a, b)-> a + b);

        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput, actualOutput);
    }

    private void solution1() {
        "dabfcadef".chars().distinct().mapToObj(c -> (char) c).forEach(System.out::println);
    }

    private void solution2() {
        Arrays.stream("dabfcadef".split("")).distinct().forEach(System.out::print);
    }
}
