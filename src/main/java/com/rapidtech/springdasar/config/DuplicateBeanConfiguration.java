package com.rapidtech.springdasar.config;

import com.rapidtech.springdasar.Model.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Slf4j
@Configuration
public class DuplicateBeanConfiguration {

//    @Primary
//    @Bean
//    public Foo foo1(){
//        log.info("Created bean foo1....!");
//        return new Foo();
//    }
//    @Bean
//    public Foo foo2(){
//        log.info("Created bean foo2....!");
//        return new Foo();
//    }

    // Mengubah nama bean
    @Primary
    @Bean(value = "fooFirst")
    public Foo foo1(){
        log.info("Created bean foo1....!");
        return new Foo();
    }
    @Bean(value = "fooSecond")
    public Foo foo2(){
        log.info("Created bean foo2....!");
        return new Foo();
    }

}
