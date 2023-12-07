package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {

        Queue<String> people = new LinkedList<>();
        people.offer("Diana");
        people.offer("Ana");
        people.offer("Andrei");
        people.offer("Bolt");

        System.out.println(people.peek());

        System.out.println(people.poll());

        System.out.println(people);

       people.poll();
        System.out.println(people);
    }
}
