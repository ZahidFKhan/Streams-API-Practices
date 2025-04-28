package com.github.streams.learn.functional_interfaces;

import static org.junit.jupiter.api.Assertions.assertFalse;

import com.github.streams.learn.functional_interfaces.ignore.models.Person;
import java.util.Comparator;
import java.util.function.IntBinaryOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class F_ComparatorTest {

  final Person ayman = new Person("Ayman", "Khan", 51);
  final Person rod = new Person("Rod", "Stewart", 71);
  final Person paul = new Person("Paul", "McCartney", 74);
  final Person mick = new Person("Mick", "Jagger", 73);
  final Person jermaine = new Person("Jermaine", "Jackson", 61);

  /**
   * Write a Comparator that compare instances of String using their length. For instance FOUR (4
   * letters) is greater than TWO (three letters)
   */
  @Test
  @Disabled
  public void comparator01() {
    java.util.Comparator<String> compareByLength = null; // TODO

    Assertions.assertTrue(compareByLength.compare("FOUR", "TWO") > 0);
    Assertions.assertTrue(compareByLength.compare("ONE", "SEVEN") < 0);
    Assertions.assertTrue(compareByLength.compare("ONE", "TWO") == 0);
  }

  // Hint:
  // <editor-fold defaultstate="collapsed">
  // Check the static factory methods of the Comparator interface. Remember
  // how you implemented functions in the previous exercises. Write it using
  // a method reference.
  // </editor-fold>

  /**
   * Write a Comparator that compare instances of String using their length. If the lengths are the
   * same, then use the alphabetical order.
   */
  @Test
  @Disabled
  public void comparator02() {
    Comparator<String> compareByLengthThenAlphabetical = null; // TODO

    Assertions.assertTrue(compareByLengthThenAlphabetical.compare("FOUR", "TWO") > 0);
    Assertions.assertTrue(compareByLengthThenAlphabetical.compare("ONE", "SEVEN") < 0);
    Assertions.assertTrue(compareByLengthThenAlphabetical.compare("ONE", "TWO") < 0);
    Assertions.assertTrue(compareByLengthThenAlphabetical.compare("FOUR", "FIVE") > 0);
    Assertions.assertTrue(compareByLengthThenAlphabetical.compare("EIGHT", "EIGHT") == 0);
  }

  // Hint:
  // <editor-fold defaultstate="collapsed">
  // Use the previous comparator and check the default methods of the
  // Comparator interface.
  // Check also the factory methods of the Comparator interface, and remember
  // that String is comparable.
  // </editor-fold>

  /** Write a Comparator that compares instances of Person using their lastName. */
  @Test
  @Disabled
  public void comparator03() {
    Comparator<Person> comparebyLastName = null; // TODO

    Assertions.assertTrue(comparebyLastName.compare(ayman, rod) < 0);
    Assertions.assertTrue(comparebyLastName.compare(paul, paul) == 0);
    Assertions.assertTrue(comparebyLastName.compare(ayman, jermaine) == 0);
  }

  // Hint:
  // <editor-fold defaultstate="collapsed">
  // Check the static factory methods of the Comparator interface. Remember
  // how you implemented functions in the previous exercises. Write it using
  // a method reference.
  // </editor-fold>

  /**
   * Write a Comparator that compares instances of Person using their lastName, and if their last
   * projectName is the same, uses their first projectName.
   */
  @Test
  @Disabled
  public void comparator04() {
    Comparator<Person> comparebyLastNameThenFirstName = null; // TODO

    Assertions.assertTrue(comparebyLastNameThenFirstName.compare(ayman, rod) < 0);
    Assertions.assertTrue(comparebyLastNameThenFirstName.compare(paul, paul) == 0);
    Assertions.assertTrue(comparebyLastNameThenFirstName.compare(ayman, jermaine) > 0);
  }

  // Hint:
  // <editor-fold defaultstate="collapsed">
  // Use the previous comparator and check the default methods of the Comparator interface.
  // </editor-fold>

  /**
   * Write a Comparator that compares the people in the order reversed from the one you wrote in the
   * comparator04() exercise. That is, the person with the greater last projectName should be
   * ordered first. If two persons have the same last projectName, the one with the greater first
   * projectName should be ordered first.
   */
  @Test
  @Disabled
  public void comparator05() {
    Comparator<Person> comparebyLastNameThenFirstNameReversed = null; // TODO

    assertFalse(comparebyLastNameThenFirstNameReversed.compare(ayman, rod) < 0);
    Assertions.assertTrue(comparebyLastNameThenFirstNameReversed.compare(paul, paul) == 0);
    assertFalse(comparebyLastNameThenFirstNameReversed.compare(ayman, jermaine) > 0);
  }

  // Hint:
  // <editor-fold defaultstate="collapsed">
  // Use the previous comparator and check the default methods of the Comparator interface.
  // </editor-fold>

  /**
   * Write a Comparator that compares the people in the same order than the one you wrote in
   * comparator04(), but that supports null values. The null values should be considered greater
   * than any non-null values.
   */
  @Test
  @Disabled
  public void comparator06() {
    Comparator<Person> comparebyLastNameThenFirstNameWithNull = null; // TODO

    Assertions.assertTrue(comparebyLastNameThenFirstNameWithNull.compare(ayman, rod) < 0);
    Assertions.assertTrue(comparebyLastNameThenFirstNameWithNull.compare(paul, paul) == 0);
    Assertions.assertTrue(comparebyLastNameThenFirstNameWithNull.compare(ayman, jermaine) > 0);
    Assertions.assertTrue(comparebyLastNameThenFirstNameWithNull.compare(mick, null) < 0);
    Assertions.assertTrue(comparebyLastNameThenFirstNameWithNull.compare(null, mick) > 0);
  }

  // Hint:
  // <editor-fold defaultstate="collapsed">
  // Use the previous comparator and check the static methods of the Comparator interface.
  // </editor-fold>

  /**
   * Write a Comparator that compares two people by age. Try to write the comparator so as to avoid
   * boxing of primitives.
   */
  @Test
  @Disabled
  public void comparator07() {
    Comparator<Person> comparebyAge = null; // TODO

    Assertions.assertTrue(comparebyAge.compare(ayman, rod) < 0);
    Assertions.assertTrue(comparebyAge.compare(paul, paul) == 0);
    Assertions.assertTrue(comparebyAge.compare(mick, jermaine) > 0);
  }

  // Hint:
  // <editor-fold defaultstate="collapsed">
  // Look for static methods on the Comparator interface that
  // have primitive specializations.
  // </editor-fold>

  /**
   * Write a lambda expression that compares two int values and returns an int result that is less
   * than, equal to, or greater than zero, like a comparator. Watch out for overflow. The Comparator
   * interface takes two objects, but in this case we are comparing int primitives, so the
   * functional interface we use is IntBinaryOperator.
   */
  @Test
  @Disabled
  public void comparator08() {
    IntBinaryOperator intCompare = null; // TODO

    Assertions.assertTrue(intCompare.applyAsInt(0, 1) < 0);
    Assertions.assertTrue(intCompare.applyAsInt(1, 1) == 0);
    Assertions.assertTrue(intCompare.applyAsInt(2, 1) > 0);
    Assertions.assertTrue(intCompare.applyAsInt(Integer.MIN_VALUE, Integer.MAX_VALUE) < 0);
    Assertions.assertTrue(intCompare.applyAsInt(Integer.MAX_VALUE, Integer.MIN_VALUE) > 0);
  }

  // Hint:
  // <editor-fold defaultstate="collapsed">
  // Use a ternary operator (cond ? result1 : result2) instead of subtraction.
  // </editor-fold>

  /**
   * Write a method reference that compares two int values and returns an int result that is less
   * than, equal to, or greater than zero, like a comparator.
   */
  @Test
  @Disabled
  public void comparator09() {
    IntBinaryOperator intCompare = null; // TODO

    Assertions.assertTrue(intCompare.applyAsInt(0, 1) < 0);
    Assertions.assertTrue(intCompare.applyAsInt(1, 1) == 0);
    Assertions.assertTrue(intCompare.applyAsInt(2, 1) > 0);
    Assertions.assertTrue(intCompare.applyAsInt(Integer.MIN_VALUE, Integer.MAX_VALUE) < 0);
    Assertions.assertTrue(intCompare.applyAsInt(Integer.MAX_VALUE, Integer.MIN_VALUE) > 0);
  }

  // Hint:
  // <editor-fold defaultstate="collapsed">
  // Use a method reference to a static method on the Integer class.
  // </editor-fold>

  /**
   * Write a method reference that compares two double values and returns an int result that is less
   * than, equal to, or greater than zero, like a comparator. There functional interface that takes
   * two doubles and returns an int, so we define one here. Comparing double values introduces
   * special cases such NaN. Consider all NaN values to be equal to each other and greater than any
   * non-NaN value.
   */
  @Test
  @Disabled
  public void comparator10() {
    DoubleToIntBiFunction doubleCompare = null; // TODO

    Assertions.assertTrue(doubleCompare.applyAsInt(0.0, 1.0) < 0);
    Assertions.assertTrue(doubleCompare.applyAsInt(1.0, 1.0) == 0);
    Assertions.assertTrue(doubleCompare.applyAsInt(2.0, 1.0) > 0);
    Assertions.assertTrue(doubleCompare.applyAsInt(Double.NaN, Double.NaN) == 0);
    Assertions.assertTrue(doubleCompare.applyAsInt(Double.NaN, 0.0) > 0);
    Assertions.assertTrue(doubleCompare.applyAsInt(0.0, Double.NaN) < 0);
  }

  interface DoubleToIntBiFunction {
    int applyAsInt(double a, double b);
  }
  // Hint:
  // <editor-fold defaultstate="collapsed">
  // Use a method reference to a static method on the Double class.
  // </editor-fold>
}
