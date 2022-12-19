package com.rapidtech.springdasar.config;

import com.rapidtech.springdasar.Model.ProductRepository;
import com.rapidtech.springdasar.Model.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ComponentConfigurationTest {
    private static ConfigurableApplicationContext context;
    @BeforeEach
    void SetUp(){
        context = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
    }

    @Test
    void componentTest() {
        ProductService productService = context.getBean(ProductService.class);
        Assertions.assertNotNull(productService);
        Assertions.assertNotNull(productService.getProductRepository());

        ProductRepository productRepository = context.getBean(ProductRepository.class);
        Assertions.assertSame(productRepository, productService.getProductRepository());
    }
}