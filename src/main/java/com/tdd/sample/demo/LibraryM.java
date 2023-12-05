package com.tdd.sample.demo;

import java.util.ArrayList;
import java.util.Collection;

public class LibraryM {

    private ArrayList<Movie> catalogue = new ArrayList<>();

    public Collection<Movie> getCatelogue(){
        return catalogue;
    }

    public void donate(Movie movie) {
        catalogue.add(movie);
        movie.addCopy();
    }

    public boolean contains(Movie movie) {
        return getCatelogue().contains(movie);
    }

}
