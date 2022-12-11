package com.example.allpay.config;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.example.allpay.properties.AliPayProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Component

@Configuration
public class AlipayConfig {
    @Autowired
    private AliPayProperties aliPayProperties;

    @Bean
    public AlipayClient alipayClient(){
        return new DefaultAlipayClient(aliPayProperties.getGatewayUrl(),
                aliPayProperties.getAppId(),
                aliPayProperties.getAppPrivateKey(),
                "JSON",
                "UTF-8",
                aliPayProperties.getAlipayPublicKey(),
                "RSA2"
        );
    }

   /* @Value("alipay.gateway_url")
    private String gatewayUrl;

    @Value("alipay.app_id")
    private String appId;

    @Value("alipay.app_private_key")
    private String appPrivateKey;

    @Value("alipay.alipay_public_key")
    private String alipayPublicKey;

    @Bean
    public AlipayClient alipayClient(){
        return new DefaultAlipayClient(gatewayUrl,
                appId,
                appPrivateKey,
                "JSON",
                "UTF-8",
                alipayPublicKey,
                "RSA2"
        );
    }*/
}
