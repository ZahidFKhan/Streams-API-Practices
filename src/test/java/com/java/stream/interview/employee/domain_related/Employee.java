package com.java.stream.interview.employee.domain_related;

import java.util.List;

public record Employee(int id, String name, List<Project> projects, Department department) {
  public long sumOfProjectDurations() {
    return projects.stream().mapToInt(Project::duration).sum();
  }

  public long projectSize() {
    return this.projects().size();
  }
}
