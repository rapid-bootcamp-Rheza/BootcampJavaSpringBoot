package com.rapidtech.springdasar.config;

import com.rapidtech.springdasar.Model.Category;
import com.rapidtech.springdasar.Model.Product;
import com.rapidtech.springdasar.Model.ProductCategory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ProductConfigurationTest {
    private static ApplicationContext context;
    @BeforeEach
    void Setup(){
        context = new AnnotationConfigApplicationContext(ProductConfiguration.class);
    }

    @Test
    void productCategoryTest() {

        Product product = context.getBean(Product.class);
        Category category = context.getBean(Category.class);
        ProductCategory productCategory = context.getBean(ProductCategory.class);

        Assertions.assertSame(product, productCategory.getProduct());
        Assertions.assertSame(category, productCategory.getCategory());

    }
}