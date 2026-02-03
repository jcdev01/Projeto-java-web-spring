package com.jairo.projeto_java_web.Resource;


import com.jairo.projeto_java_web.Entites.User;
import com.jairo.projeto_java_web.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping (value = "/user")
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


        return ResponseEntity.created(uri).body(user);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> Delete(@PathVariable Long id){
        services.DeleteUser(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value ="/{id}")
    public ResponseEntity<User> Update(@PathVariable Long id,@RequestBody User user){
    user=services.UpdateUser(id,user);
    return ResponseEntity.ok().body(user);


    }

}
