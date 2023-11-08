public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("learning java", 10);
        System.out.println(book1);

        book1.setPrice(20);
        System.out.println("new price is " + book1.getPrice());
    }
}