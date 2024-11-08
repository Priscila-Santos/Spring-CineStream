package com.tech.ada.spring_cinestream.model;


import jakarta.persistence.*;
import java.util.List;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String senha;

    @ElementCollection
    @CollectionTable(name = "generos_favoritos", joinColumns = @JoinColumn(name = "usuario_id"))
    @Column(name = "genero")
    private List<String> generosFavoritos;

    // Construtores, getters e setters

    public Usuario() {
    }

    public Usuario(String nome, String email, String senha, List<String> generosFavoritos) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.generosFavoritos = generosFavoritos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<String> getGenerosFavoritos() {
        return generosFavoritos;
    }

    public void setGenerosFavoritos(List<String> generosFavoritos) {
        this.generosFavoritos = generosFavoritos;
    }
}

