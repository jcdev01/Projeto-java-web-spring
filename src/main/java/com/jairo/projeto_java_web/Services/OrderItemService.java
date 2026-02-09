package com.jairo.projeto_java_web.Services;

import com.jairo.projeto_java_web.Entites.OrderItem;
import com.jairo.projeto_java_web.Repositories.OrderItemRepository;
import com.jairo.projeto_java_web.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service




public class OrderItemService{

    @Autowired
    private OrderItemRepository Repository;


    public List<OrderItem> findall(){

        return Repository.findAll();

    }

    public OrderItem findbyid(Long id){

        Optional<OrderItem> obj=Repository.findById(id);
        return obj.get();
    }

}
