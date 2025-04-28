package com.github.streams.learn.functional_interfaces;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.Function;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class B_FunctionTest {
  /** Write a lambda expression that wraps the given string in parentheses. */
  @Test
  @Disabled
  public void function1() {
    Function<String, String> func = null; // TODO

    assertEquals("(abc)", func.apply("abc"));
  }

  /** Write a lambda expression that converts the given string to upper case. */
  @Test
  @Disabled
  public void function2() {
    Function<String, String> func = null; // TODO

    assertEquals("ABC", func.apply("abc"));
  }

  /** Write an unbound method reference that converts the given string to upper case. */
  @Test
  @Disabled
  public void function3() {
    Function<String, String> func = null; // TODO

    assertEquals("ABC", func.apply("abc"));
  }

  /**
   * Given two Functions, one that converts a null reference to an empty string, and another that
   * gets the length of a string, create a single function converts nulls and then gets the string's
   * length.
   */
  @Test
  @Disabled
  public void function4() {
    Function<String, String> unNullify = s -> s == null ? "" : s;
    Function<String, Integer> length = String::length;

    Function<String, Integer> lengthBis = null; // TODO

    assertEquals((Integer) 14, lengthBis.apply("Hello JavaOne!"));
    assertEquals((Integer) 0, lengthBis.apply(""));
    assertEquals((Integer) 0, lengthBis.apply(null));
  }

  /**
   * Write a lambda expression that takes a string argument and returns the index of that argument
   * into the string "abcdefghij", or that returns -1 if the string argument doesn't occur.
   */
  @Test
  @Disabled
  public void g_boundMethodRef1() {
    Function<String, Integer> func = null; // TODO

    assertEquals(2, func.apply("cde").intValue());
    assertEquals(4, func.apply("efg").intValue());
    assertEquals(-1, func.apply("xyz").intValue());
  }

  // Hint:
  // <editor-fold defaultstate="collapsed">
  // Call the indexOf() method on a string literal.
  // </editor-fold>

  /**
   * Write a bound method reference that takes a string argument and returns the index of that
   * argument into the string "abcdefghij", or that returns -1 if the string argument doesn't occur.
   * A bound method reference has an instance, or an expression that evaluates to an instance, on
   * the left-hand side of the :: operator:
   *
   * <p>myObject::methodname
   *
   * <p>This is in contrast to an unbound method reference, which has a classname on the left-hand
   * side of the :: operator.
   */
  @Test
  @Disabled
  public void g_boundMethodRef2() {
    final Function<String, Integer> func = null; // TODO

    assertEquals(2, func.apply("cde").intValue());
    assertEquals(4, func.apply("efg").intValue());
    assertEquals(-1, func.apply("xyz").intValue());
  }
}
