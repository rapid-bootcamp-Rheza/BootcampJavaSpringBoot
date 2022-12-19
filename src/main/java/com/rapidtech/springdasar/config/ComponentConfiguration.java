package com.rapidtech.springdasar.config;

import com.rapidtech.springdasar.Model.ProductRepository;
import com.rapidtech.springdasar.Model.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "Programmerzamannow.spring.core.service"
})
public class ComponentConfiguration {
//    @Bean
//    public ProductService productService(){
//        return new ProductService();
//    }
//Tidak Tahu error nya kenapa
// tetapi kalo tidak pakai beans tidak bisa jalan
    @Bean
    public ProductRepository productRepository(){
        return new ProductRepository();
    }


}
