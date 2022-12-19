package com.rapidtech.springdasar.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void singletonTes1() {
        Person person1 = Person.getInstance();
        Person person2 = Person.getInstance();

        Assertions.assertSame(person1,person2);
    }
}