# Characteristics of a Stream

| Characteristic    | What it means                                                |
|-------------------|--------------------------------------------------------------|
| **Not a storage** | Streams carry data from a source; they do not hold it        |
| **Functional**    | Operations take lambdas or method references, not statements |
| **Lazy**          | Intermediate steps do not execute until a terminal is called |
| **Single-use**    | Once a terminal operation runs, the stream is consumed       |
| **Possibly parallel** | Any stream can be made parallel with `.parallelStream()` |

---
<table>
<tr>
<td style="text-align: left;">
<a href="./A%20What%20Is%20A%20Stream.md">Previous: A What Is A Stream?.md</a>
</td>
<td style="text-align: right;">
<a href="./C%20Structure%20Of%20A%20Stream%20Pipeline.md">Next: C Structure Of A Stream Pipeline.md</a>
</td>
</tr>
</table>
