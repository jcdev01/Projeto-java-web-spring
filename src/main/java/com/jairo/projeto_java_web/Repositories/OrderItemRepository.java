package com.jairo.projeto_java_web.Repositories;

import com.jairo.projeto_java_web.Entites.OrderItem;
import org.hibernate.boot.model.source.spi.JpaCallbackSource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
