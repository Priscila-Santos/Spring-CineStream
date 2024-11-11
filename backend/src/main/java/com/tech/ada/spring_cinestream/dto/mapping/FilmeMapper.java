package com.tech.ada.spring_cinestream.dto.mapping;

import com.tech.ada.spring_cinestream.dto.response.FilmeResponse;
import com.tech.ada.spring_cinestream.model.Filme;

public class FilmeMapper {
    public FilmeResponse toResponse(Filme filme) {
        return new FilmeResponse(filme.getTitulo(), filme.getGenero(),
                filme.getAno(), filme.getAvaliacao(), filme.getImageUrl());
    }
}
