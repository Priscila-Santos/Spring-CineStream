package com.tech.ada.spring_cinestream.dto.response;

public class SerieResponse {
    private String titulo;
    private String genero;
    private int ano;
    private double avaliacao;
    private String imageUrl;
    private int temporadas;

    public SerieResponse(String titulo, String genero, int ano, double avaliacao, String imageUrl, int temporadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
        this.avaliacao = avaliacao;
        this.imageUrl = imageUrl;
        this.temporadas = temporadas;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
}
