package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainMap {
    public static void main(String[] args) {

        Map<Integer, String> persons = new HashMap<>();
        persons.put(1234, "Diana Cotun");
        persons.put(2345, "Mos Craciun");
        persons.put(3456, "Bec Man");
        persons.put(3456, "Andrei Ionescu");

        System.out.println(persons);

        for (Integer key : persons.keySet()) {
            System.out.println(key + " " + persons.get(key));
        }
        System.out.println();

        for (String value : persons.values()) {
            System.out.println(value);
        }
        System.out.println();
        for (Map.Entry<Integer, String> entry : persons.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        persons.remove(1234);
        System.out.println(persons);

        persons.remove(2345, "Mos Craciun");
        System.out.println(persons);

        if (persons.containsKey(3456)) {
            System.out.println(persons.get(3456));
        }
        System.out.println(persons.get(3456));

        persons.replace(3456, "Bec Man");
        System.out.println(persons);

        Map<String, Float> salaries = new TreeMap<>();
        salaries.put("Diana", 1000000.0f);
        salaries.put("Andrei", 8000.5f);
        salaries.put("Ana", 500.0f);
        salaries.put("Florin", 10000.0f);
        System.out.println();

        System.out.println("\n" + salaries);

        Map<String, Integer> movies = new LinkedHashMap<>();
        movies.put("Titanic", 9);
        movies.put("Avengers", 9);
        movies.put("Bolt", 2);
        movies.put("Scooby Do", 3);

        System.out.println(movies);


    }
}
