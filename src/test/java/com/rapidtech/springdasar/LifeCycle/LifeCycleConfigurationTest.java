package com.rapidtech.springdasar.LifeCycle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

class LifeCycleConfigurationTest {
    private ConfigurableApplicationContext context;
    @BeforeEach
    void setUp(){
       context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
    }

    @AfterEach
    void tearDown() {
        context.close();
    }

    @Test
    void serverTest() {
        Server server = context.getBean(Server.class);
    }

    @Test
    void LifeCycleTest() {
        Connection connection = context.getBean(Connection.class);
    }
}