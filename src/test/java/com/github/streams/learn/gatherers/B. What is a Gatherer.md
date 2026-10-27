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
<td style="text-align: left;">

← [Why to use `Gatherer`?](./A.%20Why%20to%20use%20Gatherer.md)

</td>
<td style="text-align: right;">

[When to use Custom `Gatherer`?](./C.%20When%20to%20use%20Custom%20Gatherer.md) →

</td>
</tr>
</table>

