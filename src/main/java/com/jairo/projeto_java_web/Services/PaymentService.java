package com.jairo.projeto_java_web.Services;

import com.jairo.projeto_java_web.Entites.Payment;
import com.jairo.projeto_java_web.Repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.PasswordAuthentication;
import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;

    public List<Payment> findall(){
        return repository.findAll();
    }

    public Payment findbyid(Long id){
        Optional<Payment> obj=repository.findById(id);
        return obj.get();

    }



}
