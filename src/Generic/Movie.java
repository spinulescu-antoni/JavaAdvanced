package Generic;

import java.time.LocalDate;

public class Movie extends Media{

    private String director;

    private int noOfActors;

    public Movie(String title, LocalDate publicationDate, String director, int noOfActors) {
        super(title, publicationDate);
        this.director = director;
        this.noOfActors = noOfActors;
    }

    @Override
    public double calculatePrice() {
        return noOfActors * 5000.5;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getNoOfActors() {
        return noOfActors;
    }

    public void setNoOfActors(int noOfActors) {
        this.noOfActors = noOfActors;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "director='" + director + '\'' +
                ", noOfActors=" + noOfActors +
                ", title='" + title + '\'' +
                ", publicationDate=" + publicationDate +
                '}';
    }
}