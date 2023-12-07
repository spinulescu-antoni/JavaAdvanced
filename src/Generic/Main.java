package Generic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Book book1 = new Book("Java", LocalDate.of(2000,5,20),"SDA", 200);
        Book book2 = new Book("Java2",LocalDate.now(),"SDA",200);
        Book book3 = new Book("OCA",LocalDate.now(),"Author OCA",400);

        System.out.println("Books Library");

        MediaLibrary<Book> bookMediaLibrary = new MediaLibrary<>();

        bookMediaLibrary.addMedia(book1);
        bookMediaLibrary.addMedia(book2);
        bookMediaLibrary.addMedia(book3);

        bookMediaLibrary.printMedias();

        System.out.println("Initial book library total price is: " + bookMediaLibrary.getTotalPrice());

        bookMediaLibrary.removeMedia(book1);

        bookMediaLibrary.printMedias();
        System.out.println("Book library total price after sale is: " + bookMediaLibrary.getTotalPrice());


        Movie movie1 = new Movie("Titanic", LocalDate.of(1990,1,20),"Director Titanic",10);
        Movie movie2 = new Movie("Hunger Games", LocalDate.of(2023,5,12),"Director Hunger Games",5);
        Movie movie3 = new Movie("Fast & Furious", LocalDate.of(2020,4,30),"Director Fast & Furious",2);
        Movie movie4 = new Movie("IT", LocalDate.of(2022,3,25),"Director IT",1);

        System.out.println("\n MOvie library");

        MediaLibrary<Movie> movieMediaLibrary = new MediaLibrary<>();

        movieMediaLibrary.addMedia(movie1);
        movieMediaLibrary.addMedia(movie2);
        movieMediaLibrary.addMedia(movie3);
        movieMediaLibrary.addMedia(movie4);

        movieMediaLibrary.printMedias();

        System.out.println("Initial movie library total price is: " + movieMediaLibrary.getTotalPrice());

        movieMediaLibrary.removeMedia(movie3);
        movieMediaLibrary.removeMedia(movie2);

        movieMediaLibrary.printMedias();
        System.out.println("Movie library total price is: " + movieMediaLibrary.getTotalPrice());

        Newspaper newspaper1 = new Newspaper("New York Times", LocalDate.now(),"Cristian Tudor Popescu",17);
        Newspaper newspaper2 = new Newspaper("Gazeta Sporturilor", LocalDate.now(),"Corina Caragea",23);
        Newspaper newspaper3 = new Newspaper("Libertatea", LocalDate.now(),"Mihai Eminescu",8);

        System.out.println("\n NewsPaper Library");

        MediaLibrary<Newspaper> newspaperMediaLibrary = new MediaLibrary<>();

        newspaperMediaLibrary.addMedia(newspaper1);
        newspaperMediaLibrary.addMedia(newspaper2);
        newspaperMediaLibrary.addMedia(newspaper3);

        newspaperMediaLibrary.printMedias();

        System.out.println("Initial newpaper library total price is: " + newspaperMediaLibrary.getTotalPrice());

        newspaperMediaLibrary.removeMedia(newspaper2);
        newspaperMediaLibrary.removeMedia(newspaper1);
        newspaperMediaLibrary.removeMedia(newspaper3);
        System.out.println("NewsPaper Library after sale: ");

        newspaperMediaLibrary.printMedias();
        System.out.println("Newpaper library total price is: " + newspaperMediaLibrary.getTotalPrice());
    }
}
