package com.github.streams.learn.content;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import org.junit.jupiter.api.*;

/**
 * This set of exercises covers simple stream pipelines, including intermediate operations and basic
 * collectors.
 *
 * <p>Some of these exercises use a BufferedReader variable named "reader" that the test has set up
 * for you.
 */
class D_SimpleStreamsTest {
  private BufferedReader reader;

  // Hint 1:
  // <editor-fold defaultstate="collapsed">
  // Use filter() and map().
  // </editor-fold>
  // Hint 2:
  // <editor-fold defaultstate="collapsed">
  // To create the result list, use collect() with one of the
  // predefined collectors on the Collectors class.
  // </editor-fold>

  /**
   * Given a list of words, create an output list that contains only the odd-length words, converted
   * to upper case.
   */
  @Test
  @Disabled
  public void d1_upcaseOddLengthWords() {
    List<String> input = List.of("alfa", "bravo", "charlie", "delta", "echo", "foxtrot");

    List<String> result = null; // TODO

    Assertions.assertEquals(List.of("BRAVO", "CHARLIE", "DELTA", "FOXTROT"), result);
  }

  // Hint 1:
  // <editor-fold defaultstate="collapsed">
  // Use Stream.skip() and Stream.limit().
  // </editor-fold>
  // Hint 2:
  // <editor-fold defaultstate="collapsed">
  // Use Collectors.joining().
  // </editor-fold>

  /**
   * Take the third through fifth words of the list, extract the second letter from each, and join
   * them, separated by commas, into a single string. Watch for off-by-one errors.
   */
  @Test
  @Disabled
  public void d2_joinStreamRange() {
    List<String> input = List.of("alfa", "bravo", "charlie", "delta", "echo", "foxtrot");

    String result = ""; // TODO

    Assertions.assertEquals("h,e,c", result);
  }

  // Hint 1:
  // <editor-fold defaultstate="collapsed">
  // Use BufferedReader.lines() to get a stream of lines.
  // </editor-fold>
  // Hint 2:
  // <editor-fold defaultstate="collapsed">
  // Use Stream.count().
  // </editor-fold>

  /**
   * Count the number of lines in the text file. (Remember to use the BufferedReader named "reader"
   * that has already been opened for you.)
   *
   * @throws IOException
   */
  @Test
  @Disabled
  public void d3_countLinesInFile() throws IOException {
    long count = 0; // TODO

    Assertions.assertEquals(14, count);
  }

  // Hint 1:
  // <editor-fold defaultstate="collapsed">
  // Use Stream.mapToInt() to convert a stream of objects to an IntStream.
  // </editor-fold>
  // Hint 2:
  // <editor-fold defaultstate="collapsed">
  // Look at java.util.OptionalInt to get the result.
  // </editor-fold>
  // Hint 3:
  // <editor-fold defaultstate="collapsed">
  // Think about the case where the OptionalInt might be empty
  // (that is, where it has no value).
  // </editor-fold>

  /**
   * Find the length of the longest line in the text file.
   *
   * @throws IOException
   */
  @Test
  @Disabled
  public void d4_findLengthOfLongestLine() throws IOException {
    int longestLength = 0; // TODO

    Assertions.assertEquals(53, longestLength);
  }

  // Hint 1:
  // <editor-fold defaultstate="collapsed">
  // Use Stream.max() with a Comparator.
  // </editor-fold>
  // Hint 2:
  // <editor-fold defaultstate="collapsed">
  // Use static methods on Comparator to help create a Comparator instance.
  // </editor-fold>

  /**
   * Find the longest line in the text file.
   *
   * @throws IOException
   */
  @Test
  @Disabled
  public void d5_findLongestLine() throws IOException {
    String longest = null; // TODO

    Assertions.assertEquals("Feed'st thy light's flame with self-substantial fuel,", longest);
  }

  // Hint:
  // <editor-fold defaultstate="collapsed">
  // Consider making two passes over the input stream.
  // </editor-fold>

  /**
   * Select the longest words from the input list. That is, select the words whose lengths are equal
   * to the maximum word length.
   */
  @Test
  @Disabled
  public void d6_selectLongestWords() {
    List<String> input =
        List.of("alfa", "bravo", "charlie", "delta", "echo", "foxtrot", "golf", "hotel");

    List<String> result = null; // TODO

    Assertions.assertEquals(List.of("charlie", "foxtrot"), result);
  }

  // Hint:
  // <editor-fold defaultstate="collapsed">
  // Instead of a stream of words (Strings), run an IntStream of indexes of
  // the input list, using index values to get elements from the input list.
  // </editor-fold>

  // ========================================================
  // END OF EXERCISES
  // TEST INFRASTRUCTURE IS BELOW
  // ========================================================

  /**
   * Select the list of words from the input list whose length is greater than the word's position
   * in the list (starting from zero) .
   */
  @Test
  @Disabled
  public void d7_selectByLengthAndPosition() {
    List<String> input =
        List.of("alfa", "bravo", "charlie", "delta", "echo", "foxtrot", "golf", "hotel");

    List<String> result = null; // TODO

    Assertions.assertEquals(List.of("alfa", "bravo", "charlie", "delta", "foxtrot"), result);
  }

  @BeforeEach
  public void z_setUpBufferedReader() throws IOException {
    reader = Files.newBufferedReader(Paths.get("SonnetI.txt"), StandardCharsets.UTF_8);
  }

  @AfterEach
  public void z_closeBufferedReader() throws IOException {
    reader.close();
  }
}
