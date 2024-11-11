package com.tech.ada.spring_cinestream.service;

import com.tech.ada.spring_cinestream.model.Filme;
import com.tech.ada.spring_cinestream.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {

    @Autowired
    private final FilmeRepository filmeRepository;

    public FilmeService(FilmeRepository filmeRepository) {
        this.filmeRepository = filmeRepository;
    }

    public List<Filme> findAllFilmes() {
        return filmeRepository.findAll();
    }

    public Optional<Filme> findFilmesById(Long id) {
        return filmeRepository.findById(id);
    }
    @Transactional
    public Filme saveFilme(Filme filme) {
        return filmeRepository.save(filme);
    }

}
