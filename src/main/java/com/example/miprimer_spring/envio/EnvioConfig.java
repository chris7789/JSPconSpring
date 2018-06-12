package com.example.miprimer_spring.envio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnvioConfig {

    @Bean
    public IEnvioPaquete aereo(){

        return new Aereo();
    }


    @Bean
    public IEnvioPaquete terrestre(){
        return new Terrestre();
    }

}