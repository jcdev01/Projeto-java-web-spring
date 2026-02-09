package com.jairo.projeto_java_web.Resource;

import com.jairo.projeto_java_web.Entites.Payment;
import com.jairo.projeto_java_web.Services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/payment")
public class PaymentResource {

    @Autowired
    private PaymentService service;

    @GetMapping
    public ResponseEntity<List<Payment>> findall(){
        List<Payment> list=service.findall();
        return ResponseEntity.ok().body(list);

    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Payment> findbyid(@PathVariable Long id){
        Payment payment=service.findbyid(id);
        return ResponseEntity.ok().body(payment);
    }


}
