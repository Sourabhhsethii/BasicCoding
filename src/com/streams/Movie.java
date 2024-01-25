package com.streams;

public class Movie {
    private String title;
    private int likes;
    private Genre genre;



    public Movie(String title, int likes, Genre genre) {
        this.title = title;
        this.likes = likes;
        this.genre = genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getLikes() {
        return likes;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", likes=" + likes +
                '}';
    }

    public Movie(Movie movie){
        this.title = movie.title;
        this.genre = movie.genre;
        this.likes = movie.likes;
    }

    public Genre getGenre() {
        return genre;
    }
    public Movie clone(){
        return new Movie(this);
    }
}
