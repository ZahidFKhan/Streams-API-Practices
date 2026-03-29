<div align="left">

← [Why `Gatherer`?](./A_Why%20gatherer.md)

</div>

# What is a `Gatherer`?

A `Gatherer` is a reusable **intermediate stream operation** (added in Java 22) that lets you write custom transformations with memory.

## How does it work?

A `Gatherer` has four main parts:

1. **Initializer**: Creates the initial state (e.g., a list to hold elements)
2. **Integrator**: Processes each incoming element and updates state
3. **Combiner**: (Optional) Merges states from parallel streams
4. **Finisher**: (Optional) Produces final output from the state

## Key Benefit

`Gatherer` lets you write clean, reusable intermediate operations that maintain state across multiple elements—without awkward external variables.

---

<table>
<tr>
<td align="left">

← [Why to use `Gatherer`?](./A_Why%20to%20use%20Gatherer%3F.md)

</td>
<td align="right">

[When to use `Gatherer`?](./C_When%20to%20use%20Custom%20Gatherer%3F.md) →

</td>
</tr>
</table>

