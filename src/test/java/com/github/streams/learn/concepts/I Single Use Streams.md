# Single-Use Streams

A stream can be consumed only once. After a terminal operation runs, that stream is closed and cannot be reused.

Example
```java
var stream = List.of(1, 2, 3, 4).stream();

var total = stream.mapToInt(Integer::intValue).sum();
System.out.println(total);
```

If you try to use `stream` again, Java throws an `IllegalStateException`.

If you need another result, create a new stream from the source collection.

Example
```java
var numbers = List.of(1, 2, 3, 4);

var total = numbers.stream().mapToInt(Integer::intValue).sum();
var count = numbers.stream().count();

System.out.println(total);
System.out.println(count);
```

---
[Previous: H Lazy Evaluation.md](./H%20Lazy%20Evaluation.md)
[Next: J Optional Results.md](./J%20Optional%20Results.md)
