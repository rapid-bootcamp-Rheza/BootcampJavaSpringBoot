package com.rapidtech.springdasar.BeanPostProcessor;

import com.rapidtech.springdasar.Inheritance.InheritanceConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.*;
@Configuration
@Import({Car.class, IdGeneratorBeanProcessor.class})
class IdGeneratorBeanProcessorTest {
    private static ApplicationContext context;
    @BeforeEach
    void SetUp(){
        context = new AnnotationConfigApplicationContext(IdGeneratorBeanProcessor.class);
    }
    @Test
    void testIdAware() {
        Car car = context.getBean(Car.class);
        Assertions.assertNotNull(car.getId());
    }

}