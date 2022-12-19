package com.rapidtech.springdasar.OptionalDependency;

import com.rapidtech.springdasar.Model.Foo;
import com.rapidtech.springdasar.Model.FooBar;
import com.rapidtech.springdasar.fieldBasedDependency.CustomerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class optionalConfigurationTest {
    private static ConfigurableApplicationContext context;
    @BeforeEach
    void SetUp(){
        context = new AnnotationConfigApplicationContext(optionalConfiguration.class);
    }

    @Test
    void optionalTest() {
        Foo foo = context.getBean(Foo.class);
        FooBar fooBar = context.getBean(FooBar.class);

        Assertions.assertSame(fooBar.getFoo(),foo);
        Assertions.assertNull(fooBar.getBar());

        MultiFoo multiFoo = context.getBean(MultiFoo.class);
//        Assertions.assertEquals(2,multiFoo.getFoos().size());
        Assertions.assertEquals(1,multiFoo.getFoos().size());

        // Listable bean factory
        ObjectProvider<Foo> fooObjectProvider = context.getBeanProvider(Foo.class);
        Map<String, Foo> beans = context.getBeansOfType(Foo.class);

    }
}