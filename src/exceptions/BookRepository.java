package exceptions;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<Book> books;
    public BookRepository(){
        books = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "BookRepository{" +
                "books=" + books +
                '}';
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(int id) throws NoBookFoundException {
        for (Book book : books) {
           if (book.getId() == id) {
               books.remove(book);
               return;
           }
        }
        throw new NoBookFoundException("Can not delete book with id: " + id);
    }

    public void printAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public Book getByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
}

