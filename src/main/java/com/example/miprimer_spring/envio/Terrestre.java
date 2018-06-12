package com.example.miprimer_spring.envio;


public class Terrestre implements IEnvioPaquete {

@Override
public void enviar(String to, String method) {

        System.out.println("Se va a enviar de forma terreste a: " + to);
        System.out.println(" Por el metodo" + method);

        }

}