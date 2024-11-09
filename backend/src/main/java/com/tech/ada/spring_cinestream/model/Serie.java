package com.tech.ada.spring_cinestream.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Serie {

    @Id
    @GeneratedValue (strategy =GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String genero;

    @ElementCollection
    @CollectionTable(name = "serie_generos_id", joinColumns = @JoinColumn(name = "serie_id"))
    @Column(name = "genero_id")
    private List<Integer> generosId;

    private int ano;
    private String dataLancamento;
    private double avaliacao;
    private int imdbId;
    private String imageUrl;
    private int temporadas;
    private String descricao;
    private Integer quantidadeVotos;

    public Serie() {

    }

    public Serie(String titulo, String genero, List<Integer> generosId, int ano, String dataLancamento, double avaliacao, int imdbId, String imageUrl, int temporadas, String descricao, Integer quantidadeVotos) {
        this.titulo = titulo;
        this.genero = genero;
        this.generosId = generosId;
        this.ano = ano;
        this.dataLancamento = dataLancamento;
        this.avaliacao = avaliacao;
        this.imdbId = imdbId;
        this.imageUrl = imageUrl;
        this.temporadas = temporadas;
        this.descricao = descricao;
        this.quantidadeVotos = quantidadeVotos;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getImdbId() {
        return imdbId;
    }

    public void setImdbId(int imdbId) {
        this.imdbId = imdbId;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidadeVotos() {
        return quantidadeVotos;
    }

    public void setQuantidadeVotos(Integer quantidadeVotos) {
        this.quantidadeVotos = quantidadeVotos;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public List<Integer> getGenerosId() {
        return generosId;
    }

    public void setGenerosId(List<Integer> generosId) {
        this.generosId = generosId;
    }
}
