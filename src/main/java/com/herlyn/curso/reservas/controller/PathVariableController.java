package com.herlyn.curso.reservas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.herlyn.curso.reservas.model.dto.UserDtoDetail;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/path")
public class PathVariableController {

    @GetMapping("/user/{name}/{lastname}")
    public UserDtoDetail getMethodName(@PathVariable String name, @PathVariable String lastname) {
        return new UserDtoDetail(name.substring(0,1).toUpperCase()+name.substring(1),lastname);
    }    
}