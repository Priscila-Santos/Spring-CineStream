package com.tech.ada.spring_cinestream.controller;

import com.tech.ada.spring_cinestream.model.Serie;
import com.tech.ada.spring_cinestream.service.SerieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SerieController {
    private final SerieService serieService;

    public SerieController(SerieService serieService) {
        this.serieService = serieService;
    }

    @GetMapping
    public List<Serie> getAllSeries() {
        return serieService.findAllSeries();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Serie> getSeriesById(@PathVariable Long id) {
        return serieService.findSeriesById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Serie createSeries(@RequestBody Serie serie) {
        return serieService.saveSeries(serie);
    }
}
