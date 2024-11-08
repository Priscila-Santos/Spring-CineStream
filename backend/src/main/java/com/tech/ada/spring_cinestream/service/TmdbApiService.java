package com.tech.ada.spring_cinestream.service;

import com.tech.ada.spring_cinestream.dto.response.FilmeResponse;
import com.tech.ada.spring_cinestream.dto.response.SerieResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class TmdbApiService {
    private final RestTemplate restTemplate;

    @Value("${api.base.url}")
    private String apiBaseUrl;

    @Value("${api.key}")
    private String apiKey;

    public TmdbApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public FilmeResponse buscarFilmePorTitulo(String titulo) {
        String url = UriComponentsBuilder.fromHttpUrl(apiBaseUrl)
                .path("/search/movie")
                .queryParam("api_key", apiKey)
                .queryParam("query", titulo)
                .toUriString();

        return restTemplate.getForObject(url, FilmeResponse.class);
    }

    public SerieResponse buscarSeriePorTitulo(String titulo) {
        String url = UriComponentsBuilder.fromHttpUrl(apiBaseUrl)
                .path("/search/tv")
                .queryParam("api_key", apiKey)
                .queryParam("query", titulo)
                .toUriString();

        return restTemplate.getForObject(url, SerieResponse.class);
    }
}
