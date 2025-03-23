package com.herlyn.curso.reservas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.herlyn.curso.reservas.model.dto.UserDtoDetail;

@RestController
@RequestMapping("/api/params") // Se usa para establecer una ruta previa
public class RequestParamController {

    @GetMapping("/foo")
    public UserDtoDetail message(@RequestParam(required = false, defaultValue = "Hola", name="mensaje") String message){
        UserDtoDetail param = new UserDtoDetail(message,message);
        return param;
    }   
    @GetMapping("/bar")
    public UserDtoDetail bar(@RequestParam(required = false) String name, @RequestParam(required = false) String lastname){
        //UserDtoDetail bar = new UserDtoDetail(name, lastname);
        return new UserDtoDetail(name,lastname);
    }
}