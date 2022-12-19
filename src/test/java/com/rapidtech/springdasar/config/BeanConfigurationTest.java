package com.rapidtech.springdasar.config;

import com.rapidtech.springdasar.Model.Foo;
import com.rapidtech.springdasar.Model.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class BeanConfigurationTest {
    @Test
    void beanTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
            Foo foo = context.getBean(Foo.class);
            Foo foo2 =context.getBean(Foo.class);
            Foo foo3 =context.getBean(Foo.class);

            Assertions.assertSame(foo,foo2);
            Assertions.assertSame(foo2,foo3);

            Product product = context.getBean(Product.class);
            Product product2 = context.getBean(Product.class);
            Product product3 = context.getBean(Product.class);

            Assertions.assertSame(product,product2);
            Assertions.assertSame(product2,product3);
        }
    }
