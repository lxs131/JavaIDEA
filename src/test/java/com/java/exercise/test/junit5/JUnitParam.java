package com.java.exercise.test.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class JUnitParam {

    @DisplayName("是否是狗")
    @ValueSource(strings = {"dog", "cat"})
    @ParameterizedTest(name = "开始测试入参 {0} ")
    public void testIsDog(String name) {
        Assertions.assertEquals(name, "dog");
    }

}
