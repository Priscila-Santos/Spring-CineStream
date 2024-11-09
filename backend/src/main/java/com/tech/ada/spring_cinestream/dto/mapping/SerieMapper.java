package com.tech.ada.spring_cinestream.dto.mapping;
import com.tech.ada.spring_cinestream.dto.response.SerieResponse;
import com.tech.ada.spring_cinestream.model.Serie;


public class SerieMapper {
    public SerieResponse toResponse(Serie serie) {
        return new SerieResponse(serie.getGenerosId(), serie.getImdbId(), serie.getTitulo(),
                serie.getDescricao(), serie.getDataLancamento(),serie.getAvaliacao(), serie.getQuantidadeVotos(),serie.getImageUrl());
    }
}
