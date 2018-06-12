package com.example.miprimer_spring;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component("myconfig")
public class PojoConfig {

    @Value("${controlador.msj}")
    private String msj;

    @Value("${controlador.msj2}")
    private String msj2;

    @Value("${controlador.msj3}")
    private String msj3;


    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }

    public String getMsj2() {
        return msj2;
    }

    public void setMsj2(String msj2) {
        this.msj2 = msj2;
    }

    public String getMsj3() {
        return msj3;
    }

    public void setMsj3(String msj3) {
        this.msj3 = msj3;
    }

    @Override
    public String toString() {
        return "PojoConfig{" +
                "msj='" + msj + '\'' +
                ", msj2='" + msj2 + '\'' +
                ", msj3='" + msj3 + '\'' +
                '}';
    }
}