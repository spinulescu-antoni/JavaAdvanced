package Polymorphism;

import inheritance.Lecturer;
import inheritance.Person;
import inheritance.Student;
import interfaces.NetflixStreamingPlayer;
import interfaces.PrimeStreamingPlayer;
import interfaces.StreamingPlayer;

public class Main {
    public static void main(String[] args) {
        Person person = new Lecturer("SuperMan", "Bucuresti", "Java", 5000);
        person.showDetails();

        Person student = new Student("Mihai", "Bucuresti", "Java", 1, 3500);
        proceesPerson(student);
        Person lecturer = new Lecturer("Batman", "Cluj", "Law", 3000);
        proceesPerson(lecturer);

        StreamingPlayer netflix = new NetflixStreamingPlayer();
        netflix.playMovie("Movie1");

        netflix = new PrimeStreamingPlayer();
        netflix.playMovie("Movie2");
    }
        static void proceesPerson(Person person){
        person.showDetails();
        System.out.println("Accommodation pays: " + person.getAccommodationPrice());
        System.out.println("\n");

    }
}
