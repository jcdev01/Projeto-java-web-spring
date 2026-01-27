package com.jairo.projeto_java_web.Resource;

import com.jairo.projeto_java_web.Entites.Order;
import com.jairo.projeto_java_web.Entites.User;
import com.jairo.projeto_java_web.Services.OrderService;
import com.jairo.projeto_java_web.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderResource {

    @Autowired
    private OrderService services;


    @GetMapping
    public ResponseEntity<List<Order>> findall(){

        List<Order> list=services.findall();

        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findbyid(@PathVariable Long id){
        Order order=services.findbyid(id);
        return ResponseEntity.ok().body(order);


    }
}
