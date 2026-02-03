package com.jairo.projeto_java_web.Services;

import com.jairo.projeto_java_web.Entites.User;
import com.jairo.projeto_java_web.Repositories.UserRepository;
import com.jairo.projeto_java_web.Services.Exeptions.ResourceNotFoundExeception;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
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
        return obj.orElseThrow(()-> new ResourceNotFoundExeception(id));
    }

    public User SaveUser(User user){
       return  repository.save(user);
    }

    public  void DeleteUser(Long id){
        repository.deleteById(id);

    }

    public User UpdateUser(Long id,User user){
        User entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundExeception("Usuário não encontrado"));

        updatedata(entity, user);
        return repository.save(entity);
    }



    private void updatedata(User entity, User user) {
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setPhone(user.getPhone());

    }
}
