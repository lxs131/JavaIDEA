package com.java.exercise.test.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnitTestIsDog {

    @Test
    public void testIsDog() {
        String name = "cat";
        Assertions.assertEquals(name, "dog");
    }

    @Test
    public void testIsDog2() {
        String name = "dog";
        Assertions.assertEquals(name, "dog");
    }
}
