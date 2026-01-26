package com.jairo.projeto_java_web.config;


import com.jairo.projeto_java_web.Entites.User;
import com.jairo.projeto_java_web.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1=new User("maria","maria@gmail.com","1234","4321");
        User user2=new User("Laura","Laura@gmail.com","8080","9090");

        userRepository.saveAll(Arrays.asList(user1,user2));
    }
}
