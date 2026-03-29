### Why to use `Gatherer` in Streams API?

Use `Gatherer` when the logic of the Stream Operation depends on multiple elements, not just one. 
where the logic doesn't depend on not just current element but also on the previous elements and next elements.

Visually:

| Operation | Shape | Best for |
| :--- | :--- | :--- |
| `map` | `1 -> 1` | Transform each element independently |
| `filter` | `1 -> 0/1` | Keep or drop each element |
| `flatMap` | `1 -> many` | Expand one element into multiple elements |
| **`Gatherer`** | **`many -> many`** | Stateful logic across elements |

Tiny examples:
- Sliding window: `[1,2,3,4] -> [1,2], [2,3], [3,4]`
- Running total: `[2,5,3] -> [2,7,10]`
- Emit only when value changes: `[A,A,B,B,B,C] -> [A,B,C]`

In short, use `Gatherer` for custom intermediate steps that are stateful and hard to express cleanly with regular operations.
