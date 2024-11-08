package com.tech.ada.spring_cinestream.service;

import com.tech.ada.spring_cinestream.model.Serie;
import com.tech.ada.spring_cinestream.repository.SerieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SerieService {

    private final SerieRepository serieRepository;

    public SerieService(SerieRepository serieRepository) {
        this.serieRepository = serieRepository;
    }

    public List<Serie> findAllSeries() {
        return serieRepository.findAll();
    }

    public Optional<Serie> findSeriesById(Long id) {
        return serieRepository.findById(id);
    }

    public Serie saveSeries(Serie serie) {
        return serieRepository.save(serie);
    }

    // Series Para voce

    //Filmes para voce

}
