package com.MikeProject;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class MovieCsvRepository implements IMovieRepository {
    private ArrayList<Movie> list;

    // constructor
    public MovieCsvRepository() {
        this.list = new ArrayList<>();
    }

    // getters
    @Override
    public ArrayList<Movie> getAll() {
        return this.list;
    }

    @Override
    public ArrayList<String> getAllTitles() {
        ArrayList<String> result = new ArrayList<>();

        for (Movie film : this.list) result.add(film.getTitle());
        return result;
    }

    // kakapisi
    // setters
    @Override
    public void addMovie(Movie movie) {
        this.list.add(movie);
    }

    @Override
    public void removeMovie(Movie movie) {
        this.list.remove(movie);
    }

    public void readFile(String filename) {
        try (Scanner reader = new Scanner(Paths.get(filename))) {
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                String[] dataEntry = row.split(";");

                // skip first (header) line
                if (dataEntry[0].equals("Title")) continue;

                this.list.add(new Movie(dataEntry[0], Integer.parseInt(dataEntry[1])));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
