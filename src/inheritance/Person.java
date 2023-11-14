package inheritance;

public abstract class Person {
    protected String name;
    protected String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        System.out.println("Inside person constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showDetails() {
        System.out.println("Name is: " + name);
        System.out.println("Address is: " + address);
    }

    public abstract double getAccommodationPrice();



}
