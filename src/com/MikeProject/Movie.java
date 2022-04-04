package com.MikeProject;

public class Movie {
    private String title;
    private int year;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.title + ";" + this.year;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

}
