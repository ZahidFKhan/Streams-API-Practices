package com.github.streams.learn.content.functional_interfaces;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class C_ConsumerTest {
    /**
     * Write a lambda expression that appends the string "abc" to the given StringBuilder.
     */
    @Test
    public void c_consumer1() {
        Consumer<StringBuilder> cons = null; // TODO


        StringBuilder sb = new StringBuilder("xyz");
        cons = s -> s.append("abc");
        cons.accept(sb);
        assertEquals("xyzabc", sb.toString());
    }

    /**
     * Write a lambda expression that clears the given list.
     */
    @Test
    public void c_consumer2() {
        Consumer<List<String>> cons = null; // TODO

        List<String> list = new ArrayList<>(List.of("a", "b", "c"));
        cons = (l) -> l.clear();
        cons.accept(list);
        Assertions.assertTrue(list.isEmpty());
    }

    /**
     * Write an unbound method reference that clears the given list.
     */
    @Test
    public void c_consumer3() {
        Consumer<List<String>> cons = null; // TODO

        List<String> list = new ArrayList<>(List.of("a", "b", "c"));

        cons = List::clear;

        cons.accept(list);
        Assertions.assertTrue(list.isEmpty());
    }

    /**
     * Given two consumers, create a consumer that passes the String to the first consumer, then to
     * the second.
     */
    @Test
    public void c_consumer4() {
        Consumer<List<String>> c1 = list -> list.add("first");
        Consumer<List<String>> c2 = list -> list.add("second");

        Consumer<List<String>> consumer = null; // TODO

        consumer = s -> c1.andThen(c2).accept(s);

        List<String> list = new ArrayList<>(List.of("a", "b", "c"));
        consumer.accept(list);
        assertEquals(List.of("a", "b", "c", "first", "second"), list);
    }
}
