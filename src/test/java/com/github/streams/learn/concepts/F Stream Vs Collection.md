# Stream vs Collection

A `Collection` stores data. A `Stream` processes data.

- `List`, `Set`, and `Map` keep elements in memory
- A `Stream` reads those elements and applies operations to them
- A stream does not change the original collection unless you store the result somewhere

Example
```java
var numbers = List.of(1, 2, 3, 4, 5);

var evenNumbers = numbers.stream()
        .filter(number -> number % 2 == 0)
        .toList();

System.out.println(numbers);
System.out.println(evenNumbers);
```

Output
```java
[1, 2, 3, 4, 5]
[2, 4]
```

---
<table>
<tr>
<td style="text-align: left;">
<a href="./E%20Structure%20Of%20A%20Stream%20Pipeline.md">Previous: E Structure Of A Stream Pipeline.md</a>
</td>
<td style="text-align: right;">
<a href="./G%20Intermediate%20Vs%20Terminal%20Operations.md">Next: G Intermediate Vs Terminal Operations.md</a>
</td>
</tr>
</table>
