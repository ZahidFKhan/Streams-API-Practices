# What is a downstream operation in Java Streams?

In Java Streams, **downstream** usually means a **collector passed inside another collector**.

You commonly see this in:
- `Collectors.groupingBy(...)`
- `Collectors.partitioningBy(...)`
- `Collectors.teeing(...)`

The outer collector decides the buckets (for example, by department or by pass/fail), and the downstream collector decides **what to do with each bucket**.

## Why is it used?

Downstream collectors help you:
- aggregate grouped data (`counting`, `summingInt`, `averagingDouble`)
- transform values while grouping (`mapping`)
- post-process final grouped results (`collectingAndThen`)
- build nested summaries (for example, group then average)

Without downstream collectors, you often need extra loops or multiple passes.

## Simple examples

### 1) Count people per department

```java
var countByDept = employees.stream()
		.collect(Collectors.groupingBy(Employee::department, Collectors.counting()));
```

Here:
- outer collector: `groupingBy(Employee::department)`
- downstream collector: `counting()`

### 2) Collect employee names per department

```java
var namesByDept = employees.stream()
		.collect(Collectors.groupingBy(
				Employee::department,
				Collectors.mapping(Employee::name, Collectors.toList())
		));
```

Here the downstream `mapping(...)` transforms each `Employee` into only a name before collecting.

### 3) Average salary by department

```java
var avgSalaryByDept = employees.stream()
		.collect(Collectors.groupingBy(
				Employee::department,
				Collectors.averagingDouble(Employee::salary)
		));
```

## Common downstream collectors

- `counting()`
- `summingInt / summingLong / summingDouble`
- `averagingInt / averagingLong / averagingDouble`
- `maxBy / minBy`
- `mapping(...)`
- `filtering(...)` (Java 9+)
- `flatMapping(...)` (Java 9+)
- `collectingAndThen(...)`
- nested `groupingBy(...)`

## Difference from stream intermediate operations

- Intermediate operations like `map`, `filter`, `sorted` run on the stream pipeline.
- Downstream collectors run **inside `collect(...)`**, typically per group/partition.

## Tips

- Prefer clear, readable collector chains over deeply nested one-liners.
- Use `toList()` where appropriate in project code; use `Collectors.toList()` when required by APIs like `mapping(...)`.
- For `maxBy/minBy`, remember values are `Optional`.

