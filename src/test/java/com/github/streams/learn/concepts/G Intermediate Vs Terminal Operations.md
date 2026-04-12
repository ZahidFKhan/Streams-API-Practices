# Intermediate vs Terminal Operations

Intermediate operations build the pipeline. Terminal operations run it.

## Intermediate operations

These return another stream, so you can keep chaining.

Examples:
- `filter`
- `map`
- `sorted`
- `distinct`

## Terminal operations

These produce the final result or side effect.

Examples:
- `toList`
- `count`
- `reduce`
- `forEach`

Example
```java
var count = List.of("java", "stream", "api").stream()
        .filter(word -> word.length() > 3)
        .count();

System.out.println(count);
```

Output
```java
2
```

---
<table>
<tr>
<td style="text-align: left;">
<a href="./F%20Stream%20Vs%20Collection.md">Previous: F Stream Vs Collection.md</a>
</td>
<td style="text-align: right;">
<a href="./H%20Lazy%20Evaluation.md">Next: H Lazy Evaluation.md</a>
</td>
</tr>
</table>
