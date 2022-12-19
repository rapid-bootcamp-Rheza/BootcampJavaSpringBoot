package com.rapidtech.springdasar.config;

import com.rapidtech.springdasar.Model.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateBeanConfigurationTest {
    private static ApplicationContext context;
    @BeforeEach
    void Setup(){
        context = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);
    }
    @Test
    void duplicateBeanTest() {
//      Sebelum diubah nama bean nya
//        Foo foo1 = context.getBean("foo1", Foo.class);
//        Foo foo2 = context.getBean("foo2", Foo.class);
//
//        Assertions.assertNotSame(foo1,foo2);
//
//        Foo foo3 = context.getBean("foo1", Foo.class);
//        Assertions.assertSame(foo1,foo3);
//
//        Foo foo4 = context.getBean("foo2", Foo.class);
//        Assertions.assertSame(foo2,foo4);

        //Setelah diubah nama beannya

        Foo foo1 = context.getBean("fooFirst", Foo.class);
        Foo foo2 = context.getBean("fooSecond", Foo.class);

        Assertions.assertNotSame(foo1,foo2);

        Foo foo3 = context.getBean("fooFirst", Foo.class);
        Assertions.assertSame(foo1,foo3);

        Foo foo4 = context.getBean("fooSecond", Foo.class);
        Assertions.assertSame(foo2,foo4);

    }

    @Test
    void primaryBeanTest() {
        // Sebelum diubah nama beannya
//        Foo foo1 = context.getBean(Foo.class);
//        Foo foo2 = context.getBean("foo1", Foo.class);
//        Assertions.assertSame(foo1,foo2);
//
//        Foo foo3 = context.getBean("foo2", Foo.class);
//        Assertions.assertNotSame(foo1,foo3);

        //Setelah diubah nama beannya

        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean("fooFirst", Foo.class);
        Assertions.assertSame(foo1,foo2);

        Foo foo3 = context.getBean("fooSecond", Foo.class);
        Assertions.assertNotSame(foo1,foo3);
    }
}