package com.tech.ada.spring_cinestream.dto.response;

public class FilmeResponse {
    private String title;
    private String overview;
    private String releaseDate;
    private double voteAvarage;
    private String posterPath;

    public FilmeResponse(String title, String overview, String releaseDate, double voteAvarage, String posterPath) {
        this.title = title;
        this.overview = overview;
        this.releaseDate = releaseDate;
        this.voteAvarage = voteAvarage;
        this.posterPath = posterPath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getVoteAvarage() {
        return voteAvarage;
    }

    public void setVoteAvarage(double voteAvarage) {
        this.voteAvarage = voteAvarage;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }
}