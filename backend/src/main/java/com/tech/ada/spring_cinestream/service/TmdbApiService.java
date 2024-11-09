package com.tech.ada.spring_cinestream.service;

import com.tech.ada.spring_cinestream.dto.response.BuscarFilmesResponse;
import com.tech.ada.spring_cinestream.dto.response.BuscarSeriesResponse;
import com.tech.ada.spring_cinestream.dto.response.SerieResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
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

    public TmdbApiService() {
        this.restTemplate = new RestTemplate();
    }

    // ENDPOINTS da API externa
    public BuscarFilmesResponse buscarFilmePorTitulo(String titulo) {
        String url = UriComponentsBuilder.fromHttpUrl(apiBaseUrl)
                .path("/search/movie")
                .queryParam("query", titulo)
                .queryParam("language", "pt-BR")
                .toUriString();

        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", String.format("Bearer %s", apiKey));

        HttpEntity<String> entity = new HttpEntity<>(headers);

        var response = restTemplate.exchange(
            url,
            HttpMethod.GET,
            entity,
            BuscarFilmesResponse.class
        );

        return response.getBody();
    }



    public BuscarSeriesResponse buscarSeriePorTitulo(String titulo) {
        String url = UriComponentsBuilder.fromHttpUrl(apiBaseUrl)
                .path("/search/tv")
                .queryParam("api_key", apiKey)
                .queryParam("query", titulo)
                .queryParam("language", "pt-BR")
                .toUriString();

        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", String.format("Bearer %s", apiKey));

        HttpEntity<String> entity = new HttpEntity<>(headers);

        var response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                BuscarSeriesResponse.class
        );

        return response.getBody();

    }
}
