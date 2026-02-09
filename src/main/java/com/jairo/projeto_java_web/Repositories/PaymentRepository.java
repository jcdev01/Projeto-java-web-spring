package com.jairo.projeto_java_web.Repositories;

import com.jairo.projeto_java_web.Entites.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long>{
}
