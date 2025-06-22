package com.github.streams.practice.b_medium.employee;

import com.github.streams.practice.ProblemSolutions;
import com.github.streams.practice.b_medium.employee.ignore.domain_related.Department;
import com.github.streams.practice.b_medium.employee.ignore.domain_related.Employee;
import com.github.streams.practice.b_medium.employee.ignore.domain_related.Identity;
import com.github.streams.practice.b_medium.employee.ignore.domain_related.Project;
import com.github.streams.practice.b_medium.employee.ignore.domain_related.dummy_data.DummyProjects;
import java.util.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/// ### Finds the employee who has worked on the most projects.
///
/// If there are multiple employees with the same maximum number of projects, returns the employee
/// with the longest total project duration in months. If there are still ties, returns any one of
/// the tied employees.
///
/// ### Example:
///
///
/// Input:
/// ```json
///   Employee(1, "John", [
///     Project("Project A", 3),
///     Project("Project B", 2)
///   ]),
///   Employee(2, "Alice", [
///     Project("Project C", 4),
///     Project("Project D", 1)
///   ]),
///   Employee(3, "Bob", [
///     Project("Project E", 2),
///     Project("Project F", 3),
///     Project("Project G", 1)
///   ])
///
/// ```
///
///
/// Output:
/// ```json
/// Employee(3, "Bob")
/// ```
/// Explanation: Since Bob has worked on 3 projects with a total duration of 6 months.
///
class G_EmployeesWhoWorkedOnMostProject {
  private static void addEmployees(
      ArrayList<Employee> employees,
      Identity employee1,
      Collection<Project> employee1ProjectsHistory,
      Identity employee2,
      Collection<Project> employee2ProjectsHistory) {
    employees.add(
        new Employee(
            1, employee1, 10000, Department.ComputerScience, employee1ProjectsHistory, -1));

    employees.add(
        new Employee(
            2, employee2, 10000, Department.ComputerScience, employee2ProjectsHistory, -1));
  }

  @Test
  @Disabled()
  public void employeeWorkedOnMostProject() {
    // Given
    final var employee1 = new Identity("employee1@gmail.com", "Xee");
    final var employee2 = new Identity("employee2@yahoo.com", "Shee");

    final var employee1ProjectsHistory = DummyProjects.listOfProjects1();
    final var employee2ProjectsHistory = DummyProjects.listOfProjects2();

    var employees = new ArrayList<Employee>();
    addEmployees(
        employees, employee1, employee1ProjectsHistory, employee2, employee2ProjectsHistory);

    // When
    var mySolution = ProblemSolutions.employeesWorkedForMaxProjects(employees);

    // Then
    Employee yourSolution = null;

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
