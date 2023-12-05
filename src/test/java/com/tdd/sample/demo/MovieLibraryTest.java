package com.tdd.sample.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MovieLibraryTest {

    private final LibraryM library;
    private final Movie movie;

    public MovieLibraryTest(){
        library = new LibraryM();
        movie = new Movie();
    }
    
    @Test
    public void donateMovie(){        
        library.donate(movie);
        assertTrue(library.contains(movie));
    }

    @Test
    public void rentalCoppies(){
        library.donate(movie);
        assertEquals(1, movie.getCoppies());
    }
}
