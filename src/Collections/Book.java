package Collections;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Book {
    private String title;
    private int price;
    private LocalDate releaseDate;
    private List<Author> author;
    private Genre genre;

    public Book(String title, int price, LocalDate releaseDate, List<Author> author, Genre genre) {
        this.title = title;
        this.price = price;
        this.releaseDate = releaseDate;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return price == book.price && Objects.equals(title, book.title) && Objects.equals(releaseDate, book.releaseDate) && Objects.equals(author, book.author) && genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, releaseDate, author, genre);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                ", author=" + author +
                ", genre=" + genre +
                '}';
    }

}
