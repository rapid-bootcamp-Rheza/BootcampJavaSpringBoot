package com.rapidtech.springdasar.config;

import com.rapidtech.springdasar.Model.Bar;
import com.rapidtech.springdasar.Model.Foo;
import com.rapidtech.springdasar.Model.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyInjection {

    @Bean(value = "fooFirst")
    public Foo foo1(){
        return new Foo();
    }
    @Bean(value = "fooSecond")
    public Foo foo2(){
        return new Foo();
    }
    @Bean
    public Bar bar(){
        return new Bar();
    }


    @Bean
    public FooBar fooBar(@Qualifier("fooSecond") Foo foo, Bar bar){
        return new FooBar(foo,bar);
    }

}
