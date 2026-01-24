package com.jairo.projeto_java_web.Resource;


import com.jairo.projeto_java_web.Entites.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/users")
public class UserResource {


    @GetMapping
    public ResponseEntity<User> findall(){
      User user=new User("Jairo","Jairocostanascimento@gmial.com","82 991797419","1234");
        return ResponseEntity.ok().body(user);

    }

}
