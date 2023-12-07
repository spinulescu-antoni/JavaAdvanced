package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainList {
    public static void main(String[] args) {

        List<String> names = new LinkedList<>();
        names.add("Ana");
        names.add("Andrei");
        names.add("Mario");
        names.add("Diana");

        System.out.println(names);

        names.add(0,"Lara");
        System.out.println(names);

        names.remove(2);
        System.out.println(names);

        names.remove("Ana");
        System.out.println(names);

        names.set(1,"Bogdan");  // inlocuieste
        System.out.println(names);

        System.out.println(names.get(0));

        names.add("Diana");
        System.out.println(names);


        System.out.println(names.indexOf("Diana"));
        System.out.println(names.lastIndexOf("Diana"));

        List<String> names2 = names.subList(1, 3);
        System.out.println(names2);

        System.out.println(names.size());


        Collections.sort(names);
        System.out.println(names);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(1);
        numbers.add(10);

        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);

        // mai avem metode : isEmpty, isClear ;
    }
}
