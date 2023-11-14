package inheritance;

public class Computer {
    protected String os;
    protected int ram;
    protected int storage;

    public Computer(String os, int ram, int storage) {
        this.os = os;
        this.ram = ram;
        this.storage = storage;
        System.out.println("Inside computer constructor");
    }

    public void print() {
        System.out.println("Os is: " + os);
        System.out.println("Ram is: " + ram);
        System.out.println("Storage is: " + storage);
    }

}
