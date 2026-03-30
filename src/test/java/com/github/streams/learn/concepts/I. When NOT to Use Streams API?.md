# When NOT to Use Streams API?

Streams are great for declarative data processing, but they are not always the best fit.

Avoid forcing streams when:

- the logic is heavily stateful or mutation-driven
- the code becomes harder to read than a simple loop
- debugging step-by-step behavior is more important than fluent chaining
- performance depends on tight imperative control

Choose the approach that keeps the code clearest for the problem at hand.

---

<div align="left">

← [Optional Results](./H.%20Optional%20Results.md)

</div>

