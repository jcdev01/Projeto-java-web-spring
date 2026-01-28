package com.jairo.projeto_java_web.Services;

import com.jairo.projeto_java_web.Entites.Order;
import com.jairo.projeto_java_web.Entites.Product;
import com.jairo.projeto_java_web.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.PrimitiveIterator;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;


    public List<Product> findall(){
        return repository.findAll();
    }

    public Product findbyid(Long id){

        Optional<Product> obj=repository.findById(id);
        return obj.get();

    }

}
