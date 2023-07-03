package com.java.exercise.test.junit5;

import com.java.exercise.test.junit5.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// mvn test
// mvn -Dtest=com.java.exercise.test.junit5.PersonTest
@DisplayName("测试 Presion")
class PersonTest {

    @DisplayName("测试幸运数字")
    @Test
    void getLuckyNumber() {
        Person person = new Person();
        Assertions.assertEquals(7, person.getLuckyNumber());
    }

    @Test
    void test1() {
        System.out.println("MavenDemo1Test-test1");
    }

    @Test
    void test2() {
        System.out.println("MavenDemo1Test-test2");
    }
}

