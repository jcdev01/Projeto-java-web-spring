package com.jairo.projeto_java_web.Services;

import com.jairo.projeto_java_web.Entites.User;
import com.jairo.projeto_java_web.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public List<User> findall(){

        return repository.findAll();
    }

    public User findbyid(Long id){
        Optional<User> obj=repository.findById(id);
        return obj.get();
    }

    public User SaveUser(User user){
       return  repository.save(user);
    }

}
