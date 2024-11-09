package com.tech.ada.spring_cinestream.dto.response;

import java.util.List;

public class BuscarSeriesResponse {
    private Integer page;
    private List<SerieResponse> results;

    public BuscarSeriesResponse() {}


    public BuscarSeriesResponse(Integer page, List<SerieResponse> results) {
        this.page = page;
        this.results = results;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public List<SerieResponse> getResults() {
        return results;
    }

    public void setResults(List<SerieResponse> results) {
        this.results = results;
    }
}
