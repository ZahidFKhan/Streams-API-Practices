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
<td align="left">

← [Stream Pipeline](./C_Stream_Pipeline.md)

</td>
<td align="right">

[Lazy Evaluation](./E_Lazy_Evaluation.md) →

</td>
</tr>
</table>

