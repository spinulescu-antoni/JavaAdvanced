package exceptions;

public class Main2 {
    public static void main(String[] args) {
        Book book1 = new Book(1,"Java","Jane Doe",2000);
        Book book2 = new Book(2,"OOP","Batman",2010);
        Book book3 = new Book(3,"SDK","Andrei",2020);

        BookRepository bookRepository = new BookRepository();
        bookRepository.addBook(book1);
        bookRepository.addBook(book2);
        bookRepository.addBook(book3);

        bookRepository.printAllBooks();

        deleteBook(bookRepository,1);
        bookRepository.printAllBooks();

        System.out.println();

        deleteBook(bookRepository, 9);
        bookRepository.printAllBooks();
    }

    private static void deleteBook(BookRepository bookRepository, int id){
        System.out.println("Deleting book with id " + id);
        try {
            bookRepository.deleteBook(id);
        }catch (NoBookFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
