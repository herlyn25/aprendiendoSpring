package com.herlyn.curso.reservas.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
       
    @GetMapping("/details")
    public String details(Map<String, Object> model){
        model.put("title", "Hola Spring Boot Map");
        model.put("name", "Samantha y Salem");
        model.put("lastname", "Castillo Martinez");
        //model.put("email", "herly.sicte@gmail.com");
        return "details";    
    }

}
