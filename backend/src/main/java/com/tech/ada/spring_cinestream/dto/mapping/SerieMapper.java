package com.tech.ada.spring_cinestream.dto.mapping;
import com.tech.ada.spring_cinestream.dto.response.SerieResponse;
import com.tech.ada.spring_cinestream.model.Serie;


public class SerieMapper {
    public SerieResponse toResponse(Serie serie) {
        return new SerieResponse(serie.getTitulo(), serie.getGenero(),
                serie.getAno(), serie.getAvaliacao(),
                serie.getImageUrl(), serie.getTemporadas());
    }
}
