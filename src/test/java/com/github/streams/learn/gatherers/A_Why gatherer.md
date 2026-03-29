# Why use `Gatherer` in Streams API?

Use `Gatherer` when your logic depends on more than one element.

| Operation | Shape | Typical Use |
| :--- | :--- | :--- |
| `map` | `1 -> 1` | Transform each element independently |
| `filter` | `1 -> 0/1` | Keep or drop each element |
| `flatMap` | `1 -> many` | Expand one element into multiple elements |
| **`Gatherer`** | **`many -> many`** | Use multiple upstream elements to decide output |

`map`/`filter`/`flatMap` process each element mostly independently.
But some tasks need memory of previous elements.

Examples where `Gatherer` is a better fit:
- emit sliding windows: `[1,2,3,4] -> [1,2], [2,3], [3,4]`
- emit running groups/chunks based on stream state

In short: use `Gatherer` for custom, stateful intermediate transformations that are hard to express cleanly with regular stream operations.
