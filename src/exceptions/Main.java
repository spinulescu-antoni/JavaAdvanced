package exceptions;

import interfaces.StreamingPlayer;
public class Main {
    public static void main(String[] args) {
        StreamingPlayer streamingPlayer = null;
        if (streamingPlayer != null) {
            streamingPlayer.stopMovie();
        }
        System.out.println("baubau");

        String[] names = {"Alin", "Bogdan"};

        System.out.println();
        try {
            System.out.println("Before");
            System.out.println(names[1]);
            System.out.println("After");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bound");
        }
        System.out.println("After try-catch");

        try {
            simulateException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Thread.sleep(1000000);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void simulateException() throws Exception {
        System.out.println("something");
        throw new Exception("something went wrong");
    }
}
