package com.github.streams.learn.functional_interfaces;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class G_RunnableTest {

  /**
   * Write a lambda expression that appends the 'suffix' variable (a String) to the sb variable (a
   * StringBuilder).
   */
  @Test
  @Disabled
  public void f_runnable1() {
    StringBuilder sb = new StringBuilder("abc");
    String suffix = "xyz";

    Runnable r = null; // TODO

    r.run();
    r.run();
    r.run();
    assertEquals("abcxyzxyzxyz", sb.toString());
  }
}
