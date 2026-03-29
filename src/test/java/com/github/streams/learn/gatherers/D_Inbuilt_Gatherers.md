
# Inbuilt `Gatherer`s in Java

Java provides several ready-to-use `Gatherer` implementations. You don't need to write custom ones for these common patterns.

## 1. `Gatherers.scan()`

Applies a function across stream elements and emits intermediate results (like a running total).

**Example:**
```
Input:  [1, 2, 3, 4]
Function: (acc, value) -> acc + value
Output: [1, 3, 6, 10]  (cumulative sum)
```

**Use when:** You need a running calculation or accumulation across elements.

---

## 2. `Gatherers.windowFixed()`

Groups consecutive elements into fixed-size windows.

**Example:**
```
Input: [1, 2, 3, 4, 5, 6]
Window size: 2
Output: [1,2], [3,4], [5,6]
```

**Use when:** You need to process stream data in fixed-size chunks or batches.

---

## 3. `Gatherers.windowSliding()`

Creates overlapping windows of fixed size that slide by one element at a time.

**Example:**
```
Input: [1, 2, 3, 4]
Window size: 2
Output: [1,2], [2,3], [3,4]
```

**Use when:** You need to compare consecutive elements or detect patterns.

---

## Quick Comparison

| Gatherer | Purpose | Window Overlap |
|---|---|---|
| `scan()` | Running accumulation | N/A |
| `windowFixed()` | Batch processing | None (non-overlapping) |
| `windowSliding()` | Pattern detection | Yes (sliding by 1) |

---

<table>
<tr>
<td align="left">

← [When Should You Use Custom `Gatherer`?](./C_When%20to%20use%20Custom%20gatherer.md)

</td>
</tr>
</table>
