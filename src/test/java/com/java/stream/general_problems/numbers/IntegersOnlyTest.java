package com.java.stream.general_problems.numbers;

import com.java.stream.solutions.GeneralProblemsNumbersSolution;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Given a list of Strings : ["as", "123", "32", "2as"],
 * Create another list that contains only integers.
 * The output should be: [123,32]
 */
public class IntegersOnlyTest {
    @Test
    @Disabled
    void testCheckAllIntegersWithoutAlphabets(){
        var input = List.of("1","12","12a","a12");
        var actual = List.of();
        var expected = GeneralProblemsNumbersSolution.getNumberOnly(input);

        Assertions.assertEquals(expected, actual);

    }
}
