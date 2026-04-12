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

← [Stream vs Collection](./F%20Stream%20Vs%20Collection.md)

</td>
<td style="text-align: right;">

[Lazy Evaluation](./H%20Lazy%20Evaluation.md) →

</td>
</tr>
</table>

