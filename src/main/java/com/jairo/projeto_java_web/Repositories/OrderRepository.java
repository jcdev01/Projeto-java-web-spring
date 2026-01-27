package com.jairo.projeto_java_web.Repositories;

import com.jairo.projeto_java_web.Entites.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
