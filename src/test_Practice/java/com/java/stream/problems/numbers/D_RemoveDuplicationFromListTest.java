package com.java.stream.problems.numbers;

import com.github.javafaker.Faker;
import com.java.stream.solutions.GeneralNumbersProblemSolution;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Remove duplicates from an arrayList.
 * */
class D_RemoveDuplicationFromListTest {
  @Test
  @Disabled
  void testRemoveDuplicationFromListTest() {
    final var instance = Faker.instance();

    final var someValue = instance.number().randomNumber();
    final var input =
        List.of(
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            someValue,
            someValue,
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber());
    var yourSolution = List.<Long>of();
    var mySolution = GeneralNumbersProblemSolution.getUniqueNumberFromList(input);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
