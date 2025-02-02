package com.github.streams.problems.numbers.ignore.data;

import com.github.javafaker.Faker;
import java.util.List;

public class DummyData {
  public static int[][] random2DPrimitiveArray() {
    return new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
  }

  public static int fakerNumber() {
    return Faker.instance().number().numberBetween(1, 1_00_000);
  }

  public static List<Long> fakeListOfLongNumbers() {
    final var instance = Faker.instance();

    final var someValue = instance.number().randomNumber();
    return List.of(
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
  }

  public static List<Integer> fakeList() {
    return List.of(1, 34, 3, 98, 9, 76, 45, 4);
  }
}
