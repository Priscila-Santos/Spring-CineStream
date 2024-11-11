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
        Filme filmeSalvo = filmeService.savefilme(filme)
        return ResponseEntity.status(HttpStatus.CREATED).body(filmeSalvo);
    }

    @GetMapping
    public ResponseEntity<List<Filme>> listarTodosFilmes() {
        List<Filme> filmes = filmeService.findAllFilmes();
        return ResponseEntity.ok(filmes);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Filme> buscarFilmePorId(@PathVariable Long id) {
        Optional<Filme> filme = filmeService.findFilmesById(id);
        return filme.map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

}
