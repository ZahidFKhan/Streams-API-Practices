package com.github.streams.learn.functional_interfaces;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.BiFunction;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class E_BiFunctionTest {
  /**
   * Write a lambda expression that, given two strings, returns the result of concatenating the
   * first with the second, followed by the first again.
   */
  @Test
  @Disabled
  public void e_bifunction1() {
    BiFunction<String, String, String> bifunc = null; // TODO

    assertEquals("FirstSecondFirst", bifunc.apply("First", "Second"));
  }

  /**
   * Write a lambda expression that returns the index of the first occurrence of the second string
   * within the first string, or -1 if the second string doesn't occur within the first string.
   */
  @Test
  @Disabled
  public void e_bifunction2() {
    BiFunction<String, String, Integer> bifunc = null; // TODO

    assertEquals(3, bifunc.apply("abcdefghi", "def").intValue());
    assertEquals(-1, bifunc.apply("abcdefghi", "xyz").intValue());
  }

  // Hint:
  // <editor-fold defaultstate="collapsed">
  // The String method
  //     public int indexOf(String)
  // works as a BiFunction, because the receiver (a String instance)
  // counts as the first argument. The argument to indexOf() becomes
  // the second argument to the BiFunction.
  // </editor-fold>

  /**
   * Write an unbound method reference that returns the index of the first occurrence of the second
   * string within the first string, or -1 if the second string doesn't occur within the first
   * string.
   */
  @Test
  @Disabled
  public void e_bifunction3() {
    BiFunction<String, String, Integer> bifunc = null; // TODO

    assertEquals(3, bifunc.apply("abcdefghij", "def").intValue());
    assertEquals(-1, bifunc.apply("abcdefghij", "xyz").intValue());
  }
}
