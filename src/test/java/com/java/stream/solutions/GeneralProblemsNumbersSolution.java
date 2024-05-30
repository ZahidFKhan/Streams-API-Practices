package com.java.stream.solutions;

import java.util.List;

public class GeneralProblemsNumbersSolution {

    public static List<String> getNumberOnly(List<String> values) {
        return values.stream()
                .filter(x->x.matches("\\d+"))
                .toList();
    }
}
