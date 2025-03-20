package com.herlyn.curso.reservas.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.herlyn.curso.reservas.model.User;
import com.herlyn.curso.reservas.model.dto.UserDto;
import com.herlyn.curso.reservas.model.dto.UserDtoDetail;


@RestController
@RequestMapping("/api")
public class UserJSONController {
       
    @GetMapping("/rest")
    public Map<String, Object> details(){
        Map<String, Object> body = new HashMap();
        
        body.put("title", "Hola Spring Boot Map");
        body.put("name", "Samantha y Salem");
        body.put("lastname", "Castillo Martinez");
        return body;    
    }
    
    @RequestMapping(path="/rest2", method=RequestMethod.GET)
    public Map<String, Object> rest2() {
        User user = new User();
        user.setIne("126378");
        user.setNombres("Erlin de Jesus");
        user.setApellidos("Castillo Castillo");
        user.setEmail("h@c.com");
        user.setPassword("jdjdjjd");
        Map<String, Object> body = new HashMap();
       
        body.put("user", user);       
        return body;    
    }
    
    @RequestMapping(path="/restdto", method=RequestMethod.GET)
    public UserDto restDto2() {
        User user = new User();        
        user.setNombres("Erlin de Jesus");
        user.setApellidos("Castillo Castillo");
        
        UserDto userDto = new UserDto();
        userDto.setUser(user);
       
          
        return userDto;    
    }

    @RequestMapping(path="/restdtodetail", method=RequestMethod.GET)
    public UserDtoDetail restDtoDetail() {
        UserDtoDetail user = new UserDtoDetail();        
        user.setName("Erlin de Jesus");
        user.setLastname("Castillo Castillo");         
        return user;    
    }

    @RequestMapping(path = "listusers")
    public List<UserDtoDetail> listuser(){       
        UserDtoDetail userdto= new UserDtoDetail("Erlin", "Castillo");
        UserDtoDetail userdto2= new UserDtoDetail("Elkin", "Castillo");
        UserDtoDetail userdto3= new UserDtoDetail("Elver", "Castillo");
        List<UserDtoDetail> users = Arrays.asList(userdto, userdto2,userdto3);
        return users;
    } 
}
