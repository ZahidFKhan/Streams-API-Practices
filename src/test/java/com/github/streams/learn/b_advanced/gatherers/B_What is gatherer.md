# Java Stream API: The Gatherer

- The **Gatherer** is a new **intermediate operation** introduced to  the `java.util.stream.Stream` API in **Java 22**. 

- Gatherer provides a way to implement **custom intermediate operations** that go beyond the fixed one-to-one (`map`), one-to-zero/one (`filter`), and one-to-many (`flatMap`) transformations.

- It's designed to solve problems that were previously cumbersome or awkward to handle with the existing API by allowing the operation to maintain **internal state** and inspect **multiple upstream elements** before producing an output.
- 