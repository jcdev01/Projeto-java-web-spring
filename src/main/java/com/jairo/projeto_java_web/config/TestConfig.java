package com.jairo.projeto_java_web.config;


import com.jairo.projeto_java_web.Entites.Order;
import com.jairo.projeto_java_web.Entites.User;
import com.jairo.projeto_java_web.Repositories.OrderRepository;
import com.jairo.projeto_java_web.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.lang.reflect.Array;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1=new User("maria","maria@gmail.com","1234","4321");
        User user2=new User("Laura","Laura@gmail.com","8080","9090");
        Order order1 = new Order(Instant.parse("2019-06-20T19:53:07Z"),user1);
        Order order2 = new Order(Instant.parse("2019-07-21T03:42:10Z"), user2);


        userRepository.saveAll(Arrays.asList(user1,user2));
        orderRepository.saveAll(Arrays.asList(order1,order2));
    }
}
