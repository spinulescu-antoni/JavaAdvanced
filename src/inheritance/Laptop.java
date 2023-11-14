package inheritance;

public class Laptop extends Computer {
    private String battery;


    public Laptop(String os, int ram, int storage, String battery) {
        super(os, ram, storage);
        this.battery = battery;
        System.out.println("Inside laptop constructor");
    }

    public void printLaptopInfo(){
        System.out.println("Os is: " + os);
        System.out.println("Ram is: " + ram);
        System.out.println("Storage is: " + storage);
        System.out.println("Battery is: " + battery);
        super.print();

    }

    @Override
    public void print() {
        super.print();
        System.out.println("Battery is: " + battery);
    }
}

