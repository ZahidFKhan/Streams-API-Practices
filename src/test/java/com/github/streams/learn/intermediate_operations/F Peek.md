# Peek:
`Peek` is used to perform an action on each element of the stream without modifying it.
It is mainly used for debugging or logging while the stream is being processed.

```java        
List<Integer> result = List.of(1, 2, 3, 4).stream()
        .peek(n -> System.out.println("Processing: " + n))
        .map(n -> n * 2)
        .toList();

System.out.println(result);
```
Output:
```java
Processing: 1
Processing: 2
Processing: 3
Processing: 4
[2, 4, 6, 8]
```

---

<table>
<tr>
<td style="text-align: left;">

← [Previous: E Sorted](./E%20Sorted.md)

</td>
<td style="text-align: right;">

[Next: G Limit](./G%20Limit.md) →

</td>
</tr>
</table>
