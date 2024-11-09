package com.tech.ada.spring_cinestream.dto.response;

import java.util.List;

public class BuscarFilmesResponse {
    private Integer page;
    private List<FilmeResponse> results;

    public BuscarFilmesResponse() {
    }

    public BuscarFilmesResponse(Integer page, List<FilmeResponse> results) {
        this.page = page;
        this.results = results;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public List<FilmeResponse> getResults() {
        return results;
    }

    public void setResults(List<FilmeResponse> results) {
        this.results = results;
    }
}
