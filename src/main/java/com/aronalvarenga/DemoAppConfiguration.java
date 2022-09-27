package com.aronalvarenga;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoAppConfiguration {

    public String getMessage() {
        return "Texto de configuração (DemoAppConfiguration.java)";
    }

    @Bean
    public void init() {
        System.out.println("BEAN NO DEMOAPPCONFIGURATION FOI INICIALIZADO");
    }
}
