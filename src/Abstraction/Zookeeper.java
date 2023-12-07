package Abstraction;

import abstractClass.Animal;
import abstractClass.Dog;
public class Zookeeper {
    private String name;
    private int age;
    private double salary;
    private Animal animal;

    public Zookeeper(String name, int age, double salary, Animal animal) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "ZooKeeper{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", animal=" + animal +
                '}';
    }

    public void petAnimal() {
        System.out.println(name + " is petting animal");
        animal.makeSound();
    }
}
