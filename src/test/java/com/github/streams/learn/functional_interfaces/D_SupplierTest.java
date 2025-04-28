package com.github.streams.learn.functional_interfaces;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.Supplier;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class D_SupplierTest {
  /** Write a lambda expression that returns a new StringBuilder containing the string "abc". */
  @Test
  @Disabled
  public void d_supplier1() {
    Supplier<StringBuilder> sup = null; // TODO

    assertEquals("abc", sup.get().toString());
  }

  /** Write a lambda expression that returns a new, empty StringBuilder. */
  @Test
  @Disabled
  public void d_supplier2() {
    Supplier<StringBuilder> sup = null; // TODO

    assertEquals("", sup.get().toString());
  }

  /** Write a constructor reference that returns a new, empty StringBuilder. */
  @Test
  @Disabled
  public void d_supplier3() {
    Supplier<StringBuilder> sup = null; // TODO

    assertEquals("", sup.get().toString());
  }
}
