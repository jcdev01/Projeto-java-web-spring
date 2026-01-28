package com.jairo.projeto_java_web.Resource;


import com.jairo.projeto_java_web.Entites.User;
import com.jairo.projeto_java_web.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (value = "/users")
public class UserResource {

    @Autowired
    private UserService services;


    @GetMapping
    public ResponseEntity<List<User>> findall(){

        List<User> list=services.findall();

        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findbyid(@PathVariable Long id){
        User user=services.findbyid(id);
        return ResponseEntity.ok().body(user);


    }

}
