package com.jairo.projeto_java_web.Services;

import com.jairo.projeto_java_web.Entites.Order;

import com.jairo.projeto_java_web.Repositories.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findall(){

        return repository.findAll();
    }

    public Order findbyid(Long id){
        Optional<Order> obj=repository.findById(id);
        return obj.get();


    }

}


