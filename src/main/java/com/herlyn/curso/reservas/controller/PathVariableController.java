package com.herlyn.curso.reservas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.herlyn.curso.reservas.model.dto.UserDtoDetail;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/api/path")
public class PathVariableController {

    @Value("${config.codigo}")
    private String codigo;

    @Value("${config.username}")
    private String username;

    @Value("${config.message}")
    private String message;
    
    @Value("${config.colores}")
    private List colores;

    @GetMapping("/user/{name}/{lastname}")
    public UserDtoDetail getMethodName(@PathVariable String name, @PathVariable String lastname) {
        return new UserDtoDetail(name.substring(0,1).toUpperCase()+name.substring(1),lastname);
    }
    
    @PostMapping("/create")
    public UserDtoDetail postMethodName(@RequestBody UserDtoDetail entity) {
        //TODO: process POST request        
        return entity;
    }

    @GetMapping("/values")
    public Map<String, Object> values_app() {
        Map<String, Object> values_map = new HashMap<>();
        values_map.put("codigo", codigo);
        values_map.put("username", username);
        values_map.put("message", message);
        values_map.put("colores", colores);
        return values_map;
    }
    
    
}