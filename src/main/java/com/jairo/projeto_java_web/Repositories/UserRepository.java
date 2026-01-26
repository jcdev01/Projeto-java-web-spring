package com.jairo.projeto_java_web.Repositories;

import com.jairo.projeto_java_web.Entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
