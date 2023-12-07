package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Alina");
        names.add("Alina");
        names.add("Ana");
        names.add("Bob");
        names.add("Ana");


        System.out.println(names);
        System.out.println();


        names.remove("Alina");
        System.out.println(names);

        if (names.contains("Bob")) {
            System.out.println("Bob is in the set");
        }else {
            System.out.println("Bob is not in the set ");
        }

        System.out.println();
        if (names.isEmpty()) {
            System.out.println("Set is empty");
        }else {
            System.out.println("Set is not empty");
        }

        System.out.println();
        names.clear();
        System.out.println(names);

        Set<String> names2 = new HashSet<>();
        names.add("Darius");
        names.add("Andrei");
        names.add("Marius");
        names.add("Florin");
        names.add("Mircea");

        names.addAll(names2);
        System.out.println(names);
        System.out.println();


        Set<Integer> numbers =  new TreeSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);

        System.out.println(numbers);
        numbers.remove(5);
        System.out.println();

        System.out.println(numbers);
        System.out.println();

        Set<String> movies = new LinkedHashSet<>();
        movies.add("X-Men");
        movies.add("Avengers");
        movies.add("Avatar");
        movies.add("Titans");

        System.out.println(movies);

    }
}
