package com.java.stream.general_problems.numbers;

import com.java.stream.solutions.GeneralProblemsNumbersSolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/*
 * Given a list of Strings : ["as", "123", "32", "2as"],
 * Create another list that contains only integers.
 * The output should be: [123,32]
 */
public class IntegersOnlyTest {
    @Test
    void testCheckAllIntegersWithoutAlphabets(){
        var input = List.of("1","12","12a","a12");
        var actual = List.of();
        var expected = GeneralProblemsNumbersSolution.getNumberOnly(input);

        Assertions.assertEquals(expected, actual);

    }
}
