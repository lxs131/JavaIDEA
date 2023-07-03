package com.java.exercise.test.junit5;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
public class JUnitOrderTest {

    @Test
    @DisplayName("测试是否是狗")
    @Order(2)
    public void testIsDog() {
        String name = "dog";
        Assertions.assertEquals(name, "dog");
        System.out.println("is dog");
    }

    @DisplayName("是否是猫")
    @Test
    @Order(1)
    public void testIsCat() {
        String name = "cat";
        Assertions.assertEquals(name, "cat");
        System.out.println("is cat");
    }
}