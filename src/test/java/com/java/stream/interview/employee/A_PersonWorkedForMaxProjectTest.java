package com.java.stream.interview.employee;

import com.java.stream.interview.employee.domain_related.Employee;
import com.java.stream.interview.employee.domain_related.Department;
import com.java.stream.interview.employee.domain_related.Project;
import com.java.stream.solutions.InterviewProblemSolutions;
import java.util.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * You are given a list of employees. Each employee has an id, name, and a list of projects they
 * have worked on. Each project has a name and duration in months.
 *
 * <p>Write a Java program to find the employee who has worked on the most projects.
 *
 * <p>If there are multiple employees with the same maximum number of projects,
 *
 * <p>return the employee with the longest total duration of projects. If there are still ties,
 * return any one of the tied employees.
 */
class A_PersonWorkedForMaxProjectTest {
  @Test
  @Disabled()
  public void numberOfOccurencesOfEachCharacter() {
    final var project1 =
        List.of(
            new Project("E1", 2), new Project("E2", 1), new Project("E3", 2), new Project("E4", 2));

    final var project2 =
        List.of(
            new Project("E1", 2), new Project("E2", 2), new Project("E3", 2), new Project("E4", 2));

    var corporateEmployees = new ArrayList<Employee>();
    corporateEmployees.add(new Employee(1, "Priyanka", project1, Department.ComputerScience));
    corporateEmployees.add(new Employee(2, "Zahid", project2, Department.ComputerScience));

    var mySolution = InterviewProblemSolutions.employeesWorkedForMaxProjects(corporateEmployees);

    Employee yourSolution = null; // Assert that the yourSolution output matches the mySolution output

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
