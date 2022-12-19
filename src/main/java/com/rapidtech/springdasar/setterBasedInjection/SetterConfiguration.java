package com.rapidtech.springdasar.setterBasedInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SetterConfiguration {
    @Bean
    public CategoryService categoryService(){
        return new CategoryService();
    }
    @Bean
    public CategoryRepository categoryRepository(){
        return new CategoryRepository();
    }
}
