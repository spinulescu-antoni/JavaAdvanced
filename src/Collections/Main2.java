package Collections;

import Collections.*;

import java.time.LocalDate;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Author author1 = new Author("Emil", "Emilut", Gender.MALE);
        Author author2 = new Author("Dumitru", "Ana", Gender.FEMALE);
        Author author3 = new Author("Dorian", "Popa", Gender.MALE);
        Author author4 = new Author("Delia", "Ionescu", Gender.FEMALE);

        //list.of -> lista immutable (nu o putem modifica) -> nu putem face add, remove -> crapa(eroare de compilare)
        Book book1 = new Book("Colt Alb", 55, LocalDate.of(1999, 5, 21), List.of(author1, author4), Genre.ACTION);
        Book book2 = new Book("OCA", 270, LocalDate.of(2004, 11, 1), List.of(author1, author2, author4), Genre.SF);
        Book book3 = new Book("JAVA", 420, LocalDate.of(2012, 1, 28), List.of(author1), Genre.ANIME);
        Book book4 = new Book("Titanic", 15, LocalDate.of(1981, 6, 18), List.of(author3, author4), Genre.COMEDY);
        Book book5 = new Book("Spring", 700, LocalDate.of(2023, 10, 30), List.of(author2, author3), Genre.ACTION);

        BookService bookService = new BookService();
        bookService.getMostExpensiveBook();

        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.addBook(book3);
        bookService.addBook(book4);
        bookService.addBook(book5);

        System.out.println("All books are: ");
        bookService.printAllBooks();
        System.out.println();

        System.out.println("All books with action genre are: ");
        System.out.println(bookService.getBooksByGenre(Genre.ACTION));
        System.out.println();

        System.out.println("All books with SF genre are: ");
        System.out.println(bookService.getBooksByGenre(Genre.SF));
        System.out.println();


        System.out.println("All books released before 2000 are: ");
        System.out.println(bookService.getBooksBeforeReleaseYear(2000));
        System.out.println();

        System.out.println("All books released before 1950 are: ");
        System.out.println(bookService.getBooksBeforeReleaseYear(1950));
        System.out.println();

        System.out.println("The most expensive book are: ");
        System.out.println(bookService.getMostExpensiveBook());
        System.out.println();

        System.out.println("The most cheapset book are: ");
        System.out.println(bookService.getCheaperstBook());
        System.out.println();

        System.out.println("The list of books written by a Delia Ionescu: ");
        System.out.println(bookService.getBooksByAuthor(author4));
        System.out.println();

        System.out.println("All authors are: ");
        for (Author author : bookService.getAllAuthors()) {
            System.out.println(author);
        }
    }
}
