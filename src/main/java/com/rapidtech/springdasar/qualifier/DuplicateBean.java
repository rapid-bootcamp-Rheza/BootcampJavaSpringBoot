package com.rapidtech.springdasar.qualifier;

import com.rapidtech.springdasar.fieldBasedDependency.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DuplicateBean {

    @Bean
    public CustomerRepository normalCustomerRepository(){
        return new CustomerRepository();
    }
    @Bean
    public CustomerRepository premiumCustomerrepository(){
        return new CustomerRepository();
    }
}
