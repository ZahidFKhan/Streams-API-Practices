
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
<a href="./B%20Characteristics%20Of%20A%20Stream.md">Previous: B Characteristics Of A Stream.md</a>
</td>
<td style="text-align: right;">
<a href="./D%20How%20To%20Create%20A%20Stream.md">Next: D How To Create A Stream?.md</a>
</td>
</tr>
</table>
