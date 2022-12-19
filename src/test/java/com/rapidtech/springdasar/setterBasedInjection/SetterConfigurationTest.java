package com.rapidtech.springdasar.setterBasedInjection;

import com.rapidtech.springdasar.config.ComponentConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class SetterConfigurationTest {
    private static ConfigurableApplicationContext context;
    @BeforeEach
    void SetUp(){
        context = new AnnotationConfigApplicationContext(SetterConfiguration.class);
    }

    @Test
    void setterTest() {
        CategoryService categoryService = context.getBean(CategoryService.class);
        Assertions.assertNotNull(categoryService.getCategoryRepository());

        CategoryRepository categoryRepository = context.getBean(CategoryRepository.class);
        Assertions.assertSame(categoryRepository,categoryService.getCategoryRepository());
    }
}