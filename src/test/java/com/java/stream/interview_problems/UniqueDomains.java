package com.java.stream.interview_problems;

import com.github.javafaker.Faker;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * There is a list of Employees and Employee object has a field called e-mail.
 *
 * Find the list of domains ( gmail.com, yahoo.com..) and the no of occurrences for each domain?
 * */
public class UniqueDomains {
  @Test
  @Disabled
  void findUniqueDomainsWithCount() {

    final List<Employee> employees =
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
  }

  record Employee(String email) {}
}
