package com.github.streams.interview.employee;

import com.github.streams.interview.employee.domain_related.Department;
import com.github.streams.interview.employee.domain_related.Employee;
import com.github.streams.interview.employee.domain_related.Project;
import com.github.streams.solutions.InterviewProblemSolutions;
import java.util.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * You are given a list of employees. Each employee has an id, projectName, and a list of projects
 * they have worked on. Each project has a projectName and projectDurationInMonths in months.
 *
 * <p>Write a Java program to find the employee who has worked on the most projects.
 *
 * <p>If there are multiple employees with the same maximum number of projects,
 *
 * <p>return the employee with the longest total projectDurationInMonths of projects. If there are
 * still ties, return any one of the tied employees.
 */
class A_EmployeesWhoWorkedOnMostProject {
  @Test
  @Disabled()
  public void employeeWorkedOnMostProject() {
    final var projectsThatEmp1HasWorkedOn =
        List.of(
            new Project("E1", 2, Department.ComputerScience),
            new Project("E2", 1, Department.ComputerScience),
            new Project("E3", 2, Department.Civil),
            new Project("E4", 2, Department.Chemical));

    final var projectsThatEmp2HasWorkedOn =
        List.of(
            new Project("E1", 2, Department.ComputerScience),
            new Project("E2", 2, Department.ComputerScience),
            new Project("E3", 2, Department.ComputerScience),
            new Project("E4", 2, Department.ComputerScience));

    var corporateEmployees = new ArrayList<Employee>();
    final var priyanka = new Employee.Identity("x@y.z", "Priyanka");
    final var zahid = new Employee.Identity("y@y.z", "Zahid");

    corporateEmployees.add(new Employee(priyanka, 10000, Department.ComputerScience, projectsThatEmp1HasWorkedOn));

    corporateEmployees.add(new Employee(zahid, 10000, Department.ComputerScience, projectsThatEmp2HasWorkedOn));

    var mySolution = InterviewProblemSolutions.employeesWorkedForMaxProjects(corporateEmployees);

    Employee yourSolution = null;

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
