package com.tech.ada.spring_cinestream.dto.mapping;

import com.tech.ada.spring_cinestream.dto.request.UsuarioRequest;
import com.tech.ada.spring_cinestream.dto.response.UsuarioResponse;
import com.tech.ada.spring_cinestream.model.Usuario;


public class UsuarioMapper {

    public Usuario toEntity(UsuarioRequest dto) {
        Usuario usuario = new Usuario();
        usuario.setNome(dto.getNome());
        usuario.setNickName(dto.getNickname());
        usuario.setEmail(dto.getEmail());
        return usuario;
    }

    public UsuarioResponse toDTO(Usuario usuario) {
        UsuarioResponse dto = new UsuarioResponse();
        dto.setId(usuario.getId());
        dto.setNome(usuario.getNome());
        dto.setNickname(usuario.getNickName());

        return dto;
    }
}
