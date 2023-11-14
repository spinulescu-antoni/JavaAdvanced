package inheritance;

public class Student extends Person {
    private String typeOfStudy;
    private int yearOfStudy;
    private int costOfStudy;

    public Student(String name, String address, String typeOfStudy, int yearOfStudy, int costOfStudy) {
        super(name, address);
        this.typeOfStudy = typeOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.costOfStudy = costOfStudy;
        System.out.println("Inside student constructor");
    }

    @Override
    public double getAccommodationPrice() {
        return 120;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Type of study: " + typeOfStudy);
        System.out.println("Type of years: " + yearOfStudy);
        System.out.println("Type of cost: " + costOfStudy);
    }
}
