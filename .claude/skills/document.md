# Document Skill

Add or improve JavaDoc documentation on the currently open or specified Java file(s) in this project.

## What this skill does

1. Reads the target file(s)
2. Adds class-level JavaDoc with a description, input/output example, and `@author Zahid Khan`
3. Adds method-level JavaDoc with `@param`, `@return`, and an `@see` reference where applicable
4. Follows the exact patterns already used in this codebase (see examples below)

## Patterns to follow

### Test class (exercise file)

```java
/**
 * <one-line problem description>.
 *
 * <p>Example:
 *
 * <pre>
 * Input: <example input>
 * Output: <example output>
 * </pre>
 *
 * @author Zahid Khan
 * @see SolutionClass#solutionMethod(ParamType)
 */
class SomeTest {

  /**
   * <what the test verifies in one sentence>.
   */
  @Disabled
  @Test
  void testMethodName() { ... }
}
```

### Solution / utility class

```java
/**
 * <one-line description of what the method computes>.
 *
 * @param paramName <what it represents>
 * @return <what is returned>
 */
public static ReturnType methodName(ParamType param) { ... }
```

## Usage

Run `/document` with no arguments to document the file currently open in the IDE.

Run `/document <relative-or-absolute-path>` to target a specific file.

Run `/document <glob>` (e.g. `/document src/test/java/com/github/streams/practice/a_easy_problems/**/*.java`) to document multiple files at once.

## Steps

1. Identify the target file(s) from the argument (or ask the IDE which file is open).
2. Read each file.
3. Determine the type: test/exercise class or solution/utility class.
4. Write missing or incomplete JavaDoc following the patterns above.
5. Preserve all existing code — only add/update comment blocks.
6. Report what was documented.