package com.rapidtech.springdasar.qualifier;

import com.rapidtech.springdasar.fieldBasedDependency.CustomerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateBeanTest {
    private static ConfigurableApplicationContext context;
    @BeforeEach
    void SetUp(){
        context = new AnnotationConfigApplicationContext(DuplicateBean.class);
    }
    @Test
    void qualifierTest() {
        CustomerService customerService = context.getBean(CustomerService.class);

        Assertions.assertNotNull(customerService.getNormalCustomerRepository());
        Assertions.assertNotNull(customerService.getPremiumCustomerRepository());

        Assertions.assertNotSame(customerService.getNormalCustomerRepository(),
                customerService.getPremiumCustomerRepository());
    }
}