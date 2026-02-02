package com.jairo.projeto_java_web.Resource;


import com.jairo.projeto_java_web.Entites.User;
import com.jairo.projeto_java_web.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    @PostMapping
    public ResponseEntity<User> Insert(@RequestBody User user ){
        user=services.SaveUser(user);

        URI uri= ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(user.getId())
                .toUri();
        user=services.SaveUser(user);

        return ResponseEntity.created(uri).body(user);


    }

}
