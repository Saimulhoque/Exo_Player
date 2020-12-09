package com.forbit.exo_player;

public class Movie {

    Integer MovieImage;
    String MovieName;

    public Movie(Integer movieImage, String movieName) {
        MovieImage = movieImage;
        MovieName = movieName;
    }

    public Integer getMovieImage() {
        return MovieImage;
    }

    public void setMovieImage(Integer movieImage) {
        MovieImage = movieImage;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }
}
