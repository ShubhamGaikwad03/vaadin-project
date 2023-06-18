package com.example.application.model;

public class Movie {
    private String film;
    private String genre;
    private String leadStudio;
    private int audienceScore;
    private float profitability;
    private int rottenTomatoes;
    private String worldwideGross;
    private int year;

    public Movie(String film, String genre, String leadStudio, int audienceScore, Float profitability2,
                 int rottenTomatoes, String worldwideGross, int year) {
        this.film = film;
        this.genre = genre;
        this.leadStudio = leadStudio;
        this.audienceScore = audienceScore;
        this.profitability = profitability2;
        this.rottenTomatoes = rottenTomatoes;
        this.worldwideGross = worldwideGross;
        this.year = year;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLeadStudio() {
        return leadStudio;
    }

    public void setLeadStudio(String leadStudio) {
        this.leadStudio = leadStudio;
    }

    public int getAudienceScore() {
        return audienceScore;
    }

    public void setAudienceScore(int audienceScore) {
        this.audienceScore = audienceScore;
    }

    public float getProfitability() {
        return profitability;
    }

    public void setProfitability(float profitability) {
        this.profitability = profitability;
    }

    public int getRottenTomatoes() {
        return rottenTomatoes;
    }

    public void setRottenTomatoes(int rottenTomatoes) {
        this.rottenTomatoes = rottenTomatoes;
    }

    public String getWorldwideGross() {
        return worldwideGross;
    }

    public void setWorldwideGross(String worldwideGross) {
        this.worldwideGross = worldwideGross;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
