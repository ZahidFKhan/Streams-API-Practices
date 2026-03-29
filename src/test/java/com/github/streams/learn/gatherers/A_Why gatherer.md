# Why `Gatherer`? (The Problem It Solves)

Before `Gatherer`, Stream intermediate operations were great for single-element transformations, but limited for stateful, cross-element logic.

## Transformation Shapes in Stream API

| Operation | Shape | Typical Use |
| :--- | :--- | :--- |
| `map` | `1 -> 1` | Transform each element independently |
| `filter` | `1 -> 0/1` | Keep or drop each element |
| `flatMap` | `1 -> many` | Expand one element into multiple elements |
| **`Gatherer`** | **`many -> many`** | Use multiple upstream elements to decide output |

## What Was Hard Without `Gatherer`?

Some tasks need context from previous or upcoming elements, not just the current one.

Examples:
- fixed-size windows
- running groups/chunks
- stateful event processing

Without `Gatherer`, these often became awkward by:
- forcing logic into `reduce` (a terminal operation), or
- using external mutable state outside the stream pipeline.

## Why `Gatherer` Helps

`Gatherer` adds a clean, reusable way to write custom **intermediate** operations that can:
- maintain internal state,
- inspect multiple upstream elements,
- emit zero, one, or many downstream elements.

In short, `Gatherer` fills the gap between simple per-element transformations and complex stateful stream processing.
