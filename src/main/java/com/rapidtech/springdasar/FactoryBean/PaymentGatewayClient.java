package com.rapidtech.springdasar.FactoryBean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PaymentGatewayClient {
    private String endpoint;
    private String publicKey;
    private String privateKey;

    public PaymentGatewayClient() {

    }
}
