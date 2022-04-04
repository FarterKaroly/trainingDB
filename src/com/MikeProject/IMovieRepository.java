package com.MikeProject;

import java.util.ArrayList;

public interface IMovieRepository {

    void addMovie(Movie movie);

    void removeMovie(Movie movie);

    ArrayList<String> getAllTitles();

    ArrayList<Movie> getAll();
}
