
# Structure of a Stream Pipeline

Every stream expression follows the same three-part structure:

```
Source  →  Zero or more intermediate operations  →  One terminal operation
```

```java
var result = List.of(5, 3, 8, 1, 9, 2).stream()   // 1. source
        .filter(n -> n > 3)                        // 2. intermediate
        .sorted()                                  // 2. intermediate
        .toList();                                 // 3. terminal

System.out.println(result);
```

Output
```
[5, 8, 9]
```


---
<table>
<tr>
<td style="text-align: left;">
<a href="./D%20Primitive%20Streams.md">Previous: D Primitive Streams.md</a>
</td>
<td style="text-align: right;">
<a href="./F%20Stream%20Vs%20Collection.md">Next: F Stream Vs Collection.md</a>
</td>
</tr>
</table>
