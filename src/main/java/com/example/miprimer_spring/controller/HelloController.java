package com.example.miprimer_spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /*Aereo aer = new Aereo();
    IEnvioPaquete terr = new Terrestre();*/

    /*
    //primer con solo autowired y ponemos envioPaquete.enviar
    //@Autowire
    private IEnvioPaquete envioPaquete;

    //quitamos autowired y ponemos el constructor
    public HelloController(@Qualifier("terrestre") IEnvioPaquete terr){
        this.envioPaquete = terr;
    }*/

    @RequestMapping("aer")
    public String aer(){
        //envioPaquete.enviar("lupe", "aerea", 20);
        return "hola mundo desde SpringBoot";
    }

    @RequestMapping("terr")
    public String terr(){
        //terr.enviar("sancarlos", "terrestre", 20);
        return "hola mundo desde SpringBoot";
    }
}