package com.MikeProject;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        // create and fill movie repo
        MovieCsvRepository repo = new MovieCsvRepository();
        repo.readFile("movie_backlog.csv");

        ArrayList<String> titles = repo.getAllTitles();
        for(String title: titles) System.out.println(title);
    }
}
