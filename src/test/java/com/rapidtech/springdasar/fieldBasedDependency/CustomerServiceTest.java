package com.rapidtech.springdasar.fieldBasedDependency;

import com.rapidtech.springdasar.qualifier.DuplicateBean;
import com.rapidtech.springdasar.setterBasedInjection.SetterConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceTest {
    private static ConfigurableApplicationContext context;
    @BeforeEach
    void SetUp(){
        context = new AnnotationConfigApplicationContext(CustomerService.class);
    }

//    @Test
//    void fieldTest() {
//        CustomerService customerService = context.getBean(CustomerService.class);
//        Assertions.assertNotNull(customerService.getCustomerRepository());
//
//        CustomerRepository customerRepository = context.getBean(CustomerRepository.class);
//        Assertions.assertSame(customerRepository,customerService.getCustomerRepository());
//    }



}