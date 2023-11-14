package inheritance;

public class Lecturer extends Person {
    private String specialization;
    private double salary;
    public Lecturer(String name, String address, String specialization, double salary) {
        super(name, address);
        this.specialization = specialization;
        this.salary = salary;
        System.out.println("Inside lecturer constructor");
    }

    @Override
    public double getAccommodationPrice() {
        return 300;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Specialization: " + specialization);
        System.out.println("Salary: " + salary);
    }
}
