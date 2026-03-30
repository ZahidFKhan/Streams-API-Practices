### Stream vs Collection

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
<td align="left">

← [What is a Stream?](A. What is a Stream.md)

</td>
<td align="right">

[Stream Pipeline](./C_Stream_Pipeline.md) →

</td>
</tr>
</table>

