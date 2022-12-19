package com.rapidtech.springdasar.Import;

import com.rapidtech.springdasar.Model.Bar;
import com.rapidtech.springdasar.Model.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ImportConfigurationTest {

    private static ConfigurableApplicationContext context;
    @BeforeEach
    void SetUp(){
        context = new AnnotationConfigApplicationContext(ImportConfiguration.class);
    }

    @Test
    void importTest() {
        context.registerShutdownHook();

        Foo foo = context.getBean(Foo.class);
        Bar bar = context.getBean(Bar.class);
    }
}