package GenericTypes;

import abstractClass.Cat;
import abstractClass.Dog;


public class Main {
    public static void main(String[] args) {

        Box boxDog = new Box(10, 50, new Dog("Azorel", 5));
        System.out.println(boxDog);
        boxDog.setContent("baubau");
        if (boxDog.getContent() instanceof Dog) {
            Dog dog1 = (Dog) boxDog.getContent();
        } else if (boxDog.getContent() instanceof String) {
            String content = (String) boxDog.getContent();
            System.out.println(content);
        }

        BoxGeneric<Cat> catBox = new BoxGeneric<>(5, 10, new Cat("Tom", 2));
        catBox.setContent(new Cat("Miti", 5));

        Cat miti = catBox.getContent();
        System.out.println(catBox);

        BoxGeneric<Integer> integerBox = new BoxGeneric<>(1,1,5);
        System.out.println(integerBox);

        Pair<Cat, Dog> pair1 = new Pair<>(new Cat("Tom", 3), new Dog("Bolt", 1));
        System.out.println(pair1);

        Pair<Integer, String> pair2 = new Pair<>(5, "gol");

        String[] names = {"Mihai", "Alina", "Dorin"};
        Integer[] numbers = {11, 22, 33};
        Cat[] cats = {new Cat("Fifi", 2), new Cat("Mitsi", 4), new Cat("Pifi", 3)};
        System.out.println("--------------------------");

        print(names);

        print(numbers);

        print(cats);

    }
    private static <T> void print(T[] elements) {
        for (T element : elements) {
            System.out.println(element);
        }
        System.out.println();
    }
}
