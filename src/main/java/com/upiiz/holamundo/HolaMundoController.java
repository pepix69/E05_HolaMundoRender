package com.upiiz.holamundo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {
    @GetMapping("/holamundo")
    public String holaMundo(){
        return "Hola mundo de las API's con el Metodo GET";
    }

    @GetMapping("/holamundodos")
    public String holaMundo2(){
        return "Hola mundo de las API's DOS";
    }
}
