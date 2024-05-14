package com.java.stream.general_problems;

import com.github.javafaker.Faker;
import com.java.stream.solutions.GeneralProblemsSolution;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class SortListBasedOn2ndCharacterTest {
  @Test
  @Disabled
  void testSortListBasedOn2ndCharacter() {
    final var fakePersons = Faker.instance().name();
    List<String> input =
        List.of(
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name());

    List<String> expected = GeneralProblemsSolution.sortListBasedOn2ndCharacter(input);
    List<String> actual = Collections.emptyList();

    Assertions.assertEquals(expected, actual);
  }
}
