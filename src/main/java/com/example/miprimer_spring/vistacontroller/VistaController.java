package com.example.miprimer_spring.vistacontroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VistaController {


    @RequestMapping("/saludo")
    @ResponseBody
        public String saludo(){
        return "hola";

    }

}
