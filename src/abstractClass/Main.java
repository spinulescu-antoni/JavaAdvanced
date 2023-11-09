package abstractClass;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal();
        Animal dog = new Dog("Bruno", 2);
        Animal cat = new Cat("Tom", 3);
        dog.makeSound();
        cat.makeSound();


        Animal panda = new Animal("Panda",6) {
            @Override
            public void makeSound() {
                System.out.println("puf puf ");

            }
        };
        panda.makeSound();
    }
}
