package com.example.miprimer_spring.envio;

import org.springframework.stereotype.Component;

//@Component
public class Aereo implements IEnvioPaquete{

    @Override
    public void enviar(String to, String method){

        System.out.println("Se va a enviar de forma aerea a: " + to);
        System.out.println(" Por el metodo" + method);

    }
}