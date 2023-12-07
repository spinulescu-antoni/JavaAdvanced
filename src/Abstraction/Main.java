package Abstraction;

import abstractClass.Animal;
import abstractClass.Cat;
import abstractClass.Dog;
import interfaces.NetflixStreamingPlayer;
import interfaces.PrimeStreamingPlayer;
import interfaces.StreamingPlayer;

public class Main {
        public static void main(String[] args) {

            Dog dog = new Dog("Cuttu", 2);
            Zookeeper john = new Zookeeper("John", 30, 3000, dog);
            john.petAnimal();

            Dog dog2 = new Dog("Azorel", 3);
            Zookeeper kevin = new Zookeeper("Kevin", 20,2000, dog2);
            kevin.petAnimal();

            Animal animal = new Cat("Miti", 1);
            kevin.setAnimal(animal);
            kevin.petAnimal();
            System.out.println(kevin);

            Animal panda = new Animal("Panda", 5) {
                @Override
                public void makeSound() {
                    System.out.println("bau bau");
                }
            };

            Zookeeper ion = new Zookeeper("Ion", 25,2500, panda);
            ion.petAnimal();
            System.out.println("---------------------------------------------------");

            StreamingPlayer streamingPlayer = new NetflixStreamingPlayer();
            Tv tv = new Tv("Lg", 150, streamingPlayer);
            tv.play("Titanic");

            StreamingPlayer streamingPlayer1 = new PrimeStreamingPlayer();
            tv.setStreamingPlayer(streamingPlayer1);
            tv.play("Titanic 2");

        }
}
