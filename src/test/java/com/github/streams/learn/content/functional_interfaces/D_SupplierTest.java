package com.github.streams.learn.content.functional_interfaces;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.Supplier;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class D_SupplierTest {
    /**
     * Write a lambda expression that returns a new StringBuilder containing the string "abc".
     */
    @Test
    public void d_supplier1() {
        Supplier<StringBuilder> sup = null; // TODO
        sup = () -> new StringBuilder("abc");
        assertEquals("abc", sup.get().toString());
    }

    /**
     * Write a lambda expression that returns a new, empty StringBuilder.
     */
    @Test
    public void d_supplier2() {
        Supplier<StringBuilder> sup = null; // TODO
        sup = () -> new StringBuilder();
        assertEquals("", sup.get().toString());
    }

    /**
     * Write a constructor reference that returns a new, empty StringBuilder.
     */
    @Test
    public void d_supplier3() {
        Supplier<StringBuilder> sup = null; // TODO
        sup = StringBuilder::new;
        assertEquals("", sup.get().toString());
    }
}
