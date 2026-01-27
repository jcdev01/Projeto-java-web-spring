package com.jairo.projeto_java_web.Entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import org.aspectj.weaver.ast.Or;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Entity
@Table(name = "tb_user")
@JsonPropertyOrder({"id","nome","email","telefone","senha"})
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private String telefone;
    private String senha;

    @JsonIgnore
    @OneToMany(mappedBy = "client")
    private List<Order> list=new ArrayList<>();


    public User() {
    }

    public User(String nome,String email,String telefone,String senha) {

        this.nome=nome;
        this.email=email;
        this.telefone=telefone;
        this.senha=senha;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Order> getList() {
        return list;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(nome, user.nome) && Objects.equals(email, user.email) && Objects.equals(telefone, user.telefone) && Objects.equals(senha, user.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, email, telefone, senha);
    }
}
