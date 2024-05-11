package com.java.stream.interview_problems;

import com.github.javafaker.Faker;
import com.java.stream.interview_problems.domain.Employee;
import com.java.stream.solutions.InterviewProblemSolutions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * There is a list of Employees and Employee object has a field called e-mail.
 *
 * Find the list of domains ( gmail.com, yahoo.com..) and the no of occurrences for each domain?
 * */
public class UniqueDomainsTest {
  @Test
  @Disabled
  void findUniqueDomainsWithCount() {
    final var employees =
        List.of(
            new Employee(Faker.instance().internet().emailAddress()),
            new Employee(Faker.instance().internet().emailAddress()),
            new Employee(Faker.instance().internet().emailAddress()),
            new Employee(Faker.instance().internet().emailAddress()),
            new Employee(Faker.instance().internet().emailAddress()),
            new Employee(Faker.instance().internet().emailAddress()),
            new Employee(Faker.instance().internet().emailAddress()),
            new Employee(Faker.instance().internet().emailAddress()),
            new Employee(Faker.instance().internet().emailAddress()),
            new Employee(Faker.instance().internet().emailAddress()),
            new Employee(Faker.instance().internet().emailAddress()));

    final var expected = InterviewProblemSolutions.findUniqueDomainsCount(employees);

    final Map<String, ? extends Number> actual = null;

    Assertions.assertEquals(expected, actual);
  }
}
