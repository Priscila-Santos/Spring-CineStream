package com.tech.ada.spring_cinestream.controller;

import com.tech.ada.spring_cinestream.model.Filme;
import com.tech.ada.spring_cinestream.service.FilmeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    private final FilmeService filmeService;

    public FilmeController(FilmeService filmeService) {
        this.filmeService = filmeService;
    }

    @RequestMapping
    public List<Filme> findAllFilmes() {
        return filmeService.findAllFilmes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Filme> getFilmesById(@PathVariable Long id) {
        return filmeService.findFilmesById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Filme createMovie(@RequestBody Filme filme) {
        return filmeService.saveFilme(filme);
    }
}
