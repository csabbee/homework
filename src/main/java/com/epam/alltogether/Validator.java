package com.epam.alltogether;

public class Validator {
    protected Validator() {
        throw new UnsupportedOperationException();
    }

    public static void validateNotNull(Object input) {
        if (input == null) {
            throw new IllegalArgumentException("Null parameter is illegal!");
        }
    }
}
