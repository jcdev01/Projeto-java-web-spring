package com.jairo.projeto_java_web.Resource;



import com.jairo.projeto_java_web.Entites.Category;
import com.jairo.projeto_java_web.Entites.Order;
import com.jairo.projeto_java_web.Services.CategoryService;
import com.jairo.projeto_java_web.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/category")
public class CategoryResource{

    @Autowired
    private CategoryService services;


    @GetMapping
    public ResponseEntity<List<Category>> findall(){

        List<Category> list=services.findall();

        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findbyid(@PathVariable Long id){
        Category category=services.findbyid(id);
        return ResponseEntity.ok().body(category);


    }
}
