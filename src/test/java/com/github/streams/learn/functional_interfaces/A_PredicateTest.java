package com.github.streams.learn.functional_interfaces;

import java.util.function.Predicate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class A_PredicateTest {
  /**
   * Write a lambda expression that is a predicate that tests whether a string is longer than four
   * characters.
   */
  @Test
  @Disabled
  public void a_predicate1() {
    Predicate<String> pred = null; // TODO

    Assertions.assertTrue(pred.test("abcde"));
    Assertions.assertFalse(pred.test("abcd"));
  }

  /** Write a lambda expression that is a predicate that tests whether a string is empty. */
  @Test
  @Disabled
  public void a_predicate2() {
    Predicate<String> pred = null; // TODO

    Assertions.assertTrue(pred.test(""));
    Assertions.assertFalse(pred.test("a"));
  }

  /**
   * Write an unbound method reference that is a predicate that tests whether a string is empty. An
   * unbound method reference has a class projectName on the left-hand side of the :: operator:
   *
   * <p>classname::methodname
   */
  @Test
  @Disabled
  public void a_predicate3() {
    Predicate<String> pred = null; // TODO

    Assertions.assertTrue(pred.test(""));
    Assertions.assertFalse(pred.test("a"));
  }

  // Hint:
  // <editor-fold defaultstate="collapsed">
  // Copy the lambda expression from the previous exercise and then pop
  // up the menu over the "light bulb" icon in the left margin. This menu
  // has an option to convert the lambda to a method reference. (The exact
  // gesture will vary among IDEs.)
  // </editor-fold>

  /** Create a predicate that returns true if both predicates startsWithJ and lengthIs7 hold. */
  @Test
  @Disabled
  public void a_predicate4() {
    Predicate<String> startsWithJ = s -> s.startsWith("J");
    Predicate<String> lengthIs7 = s -> s.length() == 7;

    Predicate<String> startsWithJAndLengthIs7 = null; // TODO

    Assertions.assertFalse(startsWithJAndLengthIs7.test("Hello"));
    Assertions.assertFalse(startsWithJAndLengthIs7.test("HelloJ1"));
    Assertions.assertFalse(startsWithJAndLengthIs7.test("Java1"));
    Assertions.assertTrue(startsWithJAndLengthIs7.test("JavaOne"));
  }

  // Hint:
  // <editor-fold defaultstate="collapsed">
  // see java.util.function.Predicate.and()
  // </editor-fold>

  /**
   * Create a predicate that is true if the length of the provided string is 9 or the provided
   * string equals ERROR.
   */
  @Test
  @Disabled
  public void a_predicate5() {
    Predicate<String> lengthIs9 = s -> s.length() == 9;
    Predicate<String> equalsError = "ERROR"::equals;
    // Note: this could also be: Predicate.isEqual("ERROR")

    Predicate<String> lengthIs9orError = null; // TODO

    Assertions.assertFalse(lengthIs9orError.test("Hello"));
    Assertions.assertTrue(lengthIs9orError.test("Hello J1!"));
    Assertions.assertTrue(lengthIs9orError.test("ERROR"));
    Assertions.assertFalse(lengthIs9orError.test("Error"));
  }
}
