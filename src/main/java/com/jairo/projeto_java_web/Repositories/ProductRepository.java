package com.jairo.projeto_java_web.Repositories;

import com.jairo.projeto_java_web.Entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
