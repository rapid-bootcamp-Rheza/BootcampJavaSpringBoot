package com.rapidtech.springdasar.cyclic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class CyclicConfigurationTest {
        private static ApplicationContext context;
        @BeforeEach
        void setUP(){

            
        }

    @Test
    void CyclicTest() {
        Assertions.assertThrows(Throwable.class, () -> {
            context = new AnnotationConfigApplicationContext(CyclicConfiguration.class);
        });

    }
}