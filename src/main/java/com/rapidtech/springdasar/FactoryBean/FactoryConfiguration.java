package com.rapidtech.springdasar.FactoryBean;

import org.springframework.boot.autoconfigure.integration.IntegrationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
        PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {
//    @Bean
//    public PaymentGatewayClient paymentGatewayClient(){
//        return new PaymentGatewayClient();
//    }
    @Bean
    public String endPoint(){
        return new String();
    }
    @Bean
    public String publicKey(){
        return new String();
    }
    @Bean
    public String privateKey(){
        return new String();
    }
}
