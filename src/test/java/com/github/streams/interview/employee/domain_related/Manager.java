package com.github.streams.interview.employee.domain_related;

public record Manager(long id) {
  public static Manager DEFAULT_MANAGER = new Manager(0);

  public static Manager of(long id) {
    return new Manager(id);
  }
}
