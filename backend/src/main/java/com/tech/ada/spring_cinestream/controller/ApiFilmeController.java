package com.tech.ada.spring_cinestream.controller;

import com.tech.ada.spring_cinestream.dto.request.FilmeRequest;
import com.tech.ada.spring_cinestream.dto.response.BuscarFilmesResponse;
import com.tech.ada.spring_cinestream.service.FilmeService;
import com.tech.ada.spring_cinestream.service.TmdbApiService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/external")
public class ApiFilmeController {
    private final TmdbApiService tmdbApiService;
    private final FilmeService filmeService;


    public ApiFilmeController(TmdbApiService tmdbApiService, FilmeService filmeService) {
        this.tmdbApiService = tmdbApiService;
        this.filmeService = filmeService;
    }

    @GetMapping("/filmes")
    public BuscarFilmesResponse buscarFilmePorTitulo(@RequestParam String titulo) {
        return tmdbApiService.buscarFilmePorTitulo(titulo);
    }

    @PostMapping("/filmes")
    public void salvarFilmeDaApi(@RequestBody FilmeRequest request) {
        var filmeResponse = tmdbApiService.buscarFilmePorTitulo(request.getTitulo());
        System.out.println(filmeResponse);
//        Filme filme = new Filme();
//
//        filme.setTitulo(filmeResponse.getTitle());
//        //descricao
//        filme.setAno(filmeResponse.getReleaseDate());
//        filme.setAvaliacao(filmeResponse.getVoteAverage());
//        filme.setImageUrl(filmeResponse.getPosterPath());
//
//        return filmeService.saveFilme(filme);
    }
}
