package Generic;

import java.time.LocalDate;

public class Book extends Media{

    private String author;

    private int nrOfPages;


    public Book(String title, LocalDate publicationDate, String author, int nrOfPages) {
        super(title, publicationDate);
        this.author = author;
        this.nrOfPages = nrOfPages;
    }

    @Override
    public double calculatePrice() {
        return nrOfPages * 2.5;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNrOfPages() {
        return nrOfPages;
    }

    public void setNrOfPages(int nrOfPages) {
        this.nrOfPages = nrOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", nrOfPages=" + nrOfPages +
                ", title='" + title + '\'' +
                ", publicationDate=" + publicationDate +
                '}';
    }
}
