package com.herlyn.curso.reservas.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.herlyn.curso.reservas.model.dto.UserDtoDetail;

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

    @GetMapping("/listmap")
    public String listmap(ModelMap model){       
        model.addAttribute("title","Listado de usuarios");
        return "list";
    }

    @ModelAttribute("users")
    public List<UserDtoDetail> userModel(){
        return Arrays.asList(new UserDtoDetail("Erlin", "Castillo"),
                             new UserDtoDetail("Elkin", "Castillo"),
                             new UserDtoDetail("Elver", "Castillo") );
    }

}
