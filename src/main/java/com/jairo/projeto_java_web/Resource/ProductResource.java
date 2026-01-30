package com.jairo.projeto_java_web.Resource;


import com.jairo.projeto_java_web.Entites.Order;
import com.jairo.projeto_java_web.Entites.Product;
import com.jairo.projeto_java_web.Services.OrderService;
import com.jairo.projeto_java_web.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductResource {

    @Autowired
    private ProductService services;


    @GetMapping
    public ResponseEntity<List<Product>> findall(){

        List<Product> list=services.findall();

        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findbyid(@PathVariable Long id){
        Product product=services.findbyid(id);
        return ResponseEntity.ok().body(product);


    }



}
