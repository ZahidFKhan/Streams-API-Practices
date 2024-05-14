package com.java.stream.general_problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Comparator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Ab_HighestWordTest {
    @Test
    @Disabled()
    public void findHighestWord() {
        final String input = "I am interested123455 to grow in my organization";
        final String expectedOutput = "interested123455";

        String actualOutput = "<PUT YOUR LOGIC HERE>";

        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput, actualOutput);
    }

    private void solution1() {
        String maxString = Arrays.stream("dabfcadef".split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println("The maxString is: " + maxString);
    }
}
