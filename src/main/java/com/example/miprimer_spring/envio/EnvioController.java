package com.example.miprimer_spring.envio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EnvioController {


    //quieri crear una instancia de aero y terrestre pero se haran muchas dependencias no sera optimo por eso se hace injeccion de dependencia
    /*Aereo aer = new Aereo();
    Terrestre terr = new Terrestre();
    como se hace?
    a la clase aereo no quiero tocarla a si que en envio config se crea un bean una instancia de la clase arereo, se crea un componente de spring se hace vivo
    de esta forma se crea aereo en el corazon de spring, como usar esta instancia: @Autowrired private IenvioPaquete aereo, esto es inyeccion de dependencia de esta bean
    */

    //@Autowired
    private IEnvioPaquete envioPaquete;

    public EnvioController(IEnvioPaquete terrestre){ //este constructor es lo mismo que el autowrirer para la injeccin de dependencia en este caso envioPaquete toma la forma de terrestre

        this.envioPaquete = terrestre;
    }




    @Autowired
    private IEnvioPaquete aereo;


    @Autowired
    private IEnvioPaquete terrestre;


    @RequestMapping("/aer")
    @ResponseBody
    public String aer(){
        aereo.enviar("John","Las Bahamas");
        return "Enviado de forma aerea";
    }

    @RequestMapping("/terr")
    @ResponseBody
    public String terr(){
        terrestre.enviar("Mary","Miami");
        return "Enviado de forma terrestre";
    }

    @RequestMapping("/envio")
    @ResponseBody
    public String envio(){
        envioPaquete.enviar("Mary","Miami");
        return "Enviado de cualquier forma";
    }


}