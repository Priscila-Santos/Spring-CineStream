package com.tech.ada.spring_cinestream.controller;

import com.tech.ada.spring_cinestream.dto.response.FilmeResponse;
import com.tech.ada.spring_cinestream.model.Filme;
import com.tech.ada.spring_cinestream.service.FilmeService;
import com.tech.ada.spring_cinestream.service.TmdbApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/external")
public class ApiFilmeController {
    private final TmdbApiService tmdbApiService;
    private final FilmeService filmeService;

    @Autowired
    public ApiFilmeController(TmdbApiService tmdbApiService, FilmeService filmeService) {
        this.tmdbApiService = tmdbApiService;
        this.filmeService = filmeService;
    }

    @GetMapping("/filmes")
    public FilmeResponse buscarFilmePorTitulo(@RequestParam String titulo) {
        return tmdbApiService.buscarFilmePorTitulo(titulo);
    }

    @PostMapping("/filmes/salvar")
    public Filme salvarFilmeDaApi(@RequestParam String titulo) {
        FilmeResponse filmeResponse = tmdbApiService.buscarFilmePorTitulo(titulo);
        Filme filme = new Filme();

        filme.setTitulo(filmeResponse.getTitle());
        //descricao
        filme.setAno(filmeResponse.getReleaseDate());
        filme.setAvaliacao(filmeResponse.getVoteAvarage());
        filme.setImageUrl(filmeResponse.getPosterPath());

        return filmeService.saveFilme(filme);
    }
}
