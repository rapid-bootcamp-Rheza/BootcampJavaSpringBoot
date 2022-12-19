package com.rapidtech.springdasar.FactoryBean;

import com.rapidtech.springdasar.fieldBasedDependency.CustomerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class FactoryConfigurationTest {
    private static ApplicationContext context;
    @BeforeEach
    void SetUp(){
        context = new AnnotationConfigApplicationContext(FactoryConfiguration.class);
//             membutuhkan bean
        // error : No qualifying bean of type 'com.rapidtech.springdasar.FactoryBean.PaymentGatewayClient'
    }

//    void SetUp(){
//        context = new AnnotationConfigApplicationContext(PaymentGatewayClient.class);
//    }
// menggunakan class ini menghasilkan return == null
    @Test
    void factoryBeanTest() {
        PaymentGatewayClient client = context.getBean(PaymentGatewayClient.class);
        Assertions.assertEquals("https://payment/",client.getEndpoint());
        Assertions.assertEquals("PRIVATE",client.getPrivateKey());
        Assertions.assertEquals("PUBLIC",client.getPublicKey());



    }
}