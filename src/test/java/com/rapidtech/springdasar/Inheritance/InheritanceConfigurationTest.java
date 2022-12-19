package com.rapidtech.springdasar.Inheritance;

import com.rapidtech.springdasar.setterBasedInjection.SetterConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class InheritanceConfigurationTest {

    private static ApplicationContext context;
    @BeforeEach
    void SetUp(){
        context = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
    }

    @Test
    void inheritanceTest() {
        MerchantService merchantService = context.getBean(MerchantService.class);
        MerchantServiceImpl merchantServiceImpl = context.getBean(MerchantServiceImpl.class);

        Assertions.assertSame(merchantService,merchantServiceImpl);
    }
}