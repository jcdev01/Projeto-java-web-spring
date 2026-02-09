package com.jairo.projeto_java_web.Resource;


import com.jairo.projeto_java_web.Entites.Order;
import com.jairo.projeto_java_web.Entites.OrderItem;
import com.jairo.projeto_java_web.Services.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.Name;
import java.util.List;

@RestController()
@RequestMapping(value = "/orderitem")
public class OrderItemResource {

    @Autowired
    private OrderItemService service;

    @GetMapping()
    public ResponseEntity<List<OrderItem>> findall(){
      List<OrderItem> list=service.findall();
      return ResponseEntity.ok().body(list);


    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<OrderItem> findbyid(@PathVariable Long id){
      OrderItem orderItem=service.findbyid(id);
      return ResponseEntity.ok().body(orderItem);

    }

}
