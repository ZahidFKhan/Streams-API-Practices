package com.github.streams.interview.problems.employee;

import com.github.streams.interview.InterviewProblemSolutions;
import com.github.streams.interview.problems.employee.ignore.domain_related.*;
import com.github.streams.interview.problems.employee.ignore.domain_related.dummy_data.DummyProjects;
import java.util.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * 1. You are given a list of employees. 2. Each employee has an id, projectName, and a list of
 * projects they have worked on. 3. Each project has a projectName and projectDurationInMonths in
 * months.
 *
 * <p>find the employee who has worked on the most projects using Streams API
 *
 * <p>If there are multiple employees with the same maximum number of projects,
 *
 * <p>return the employee with the longest total projectDurationInMonths of projects. If there are
 * still ties, return any one of the tied employees.
 */
class G_EmployeesWhoWorkedOnMostProject {
  @Test
  @Disabled()
  public void employeeWorkedOnMostProject() {
    final var projectsThatEmp1HasWorkedOn = DummyProjects.listOfProjects1();
    final var projectsThatEmp2HasWorkedOn = DummyProjects.listOfProjects2();

    final var employee1 = new Identity("x@y.z", "employee1");
    final var employee2 = new Identity("y@a.z", "employee2");

    var employees = new ArrayList<Employee>();
    employees.add(
        new Employee(
            1, employee1, 10000, Department.ComputerScience, projectsThatEmp1HasWorkedOn, -1));

    employees.add(
        new Employee(
            1, employee2, 10000, Department.ComputerScience, projectsThatEmp2HasWorkedOn, -1));

    var mySolution = InterviewProblemSolutions.employeesWorkedForMaxProjects(employees);

    Employee yourSolution = null;

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
