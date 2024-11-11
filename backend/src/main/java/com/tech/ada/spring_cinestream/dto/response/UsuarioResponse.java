package com.tech.ada.spring_cinestream.dto.response;

public class UsuarioResponse {
    private Long id;
    private String nome;
    private String nickname;

    public UsuarioResponse () {
    }


    public UsuarioResponse(Long id, String nome, String nickname) {
        this.id = id;
        this.nome = nome;
        this.nickname = nickname;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
