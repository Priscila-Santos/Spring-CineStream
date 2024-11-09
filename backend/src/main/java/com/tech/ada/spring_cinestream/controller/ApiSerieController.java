package com.tech.ada.spring_cinestream.controller;

import com.tech.ada.spring_cinestream.dto.response.BuscarSeriesResponse;
import com.tech.ada.spring_cinestream.service.SerieService;
import com.tech.ada.spring_cinestream.service.TmdbApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/external")
public class ApiSerieController {

    private final TmdbApiService tmdbApiService;
    private final SerieService serieService;

    public ApiSerieController(TmdbApiService tmdbApiService, SerieService serieService) {
        this.tmdbApiService = tmdbApiService;
        this.serieService = serieService;
    }

    @GetMapping("/series")
    public BuscarSeriesResponse buscarSeriesPorTitulo(@RequestParam String titulo) {
        return tmdbApiService.buscarSeriePorTitulo(titulo);
    }
}
