package com.booleanuk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {
    @Test
    public void shouldSayHelloWorld() {
        Assertions.assertEquals("Hello, world!", Sample.sayHelloWorld());
    }

    @Test
    public void shouldAnswerTheUltimateQuestion() {
        Assertions.assertEquals(42, Sample.answerTheUltimateQuestion());
    }
}
