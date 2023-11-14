package inheritance;

public class Main2 {
    public static void main(String[] args) {
        Person student = new Student("Mihai", "Bucuresti", "Java", 1, 3500);
        student.showDetails();
        System.out.println("Studen pays: " + student.getAccommodationPrice());
        System.out.println("-----------");

        Person lecturer = new Lecturer("Batman","Cluj","Law",3000);
        lecturer.showDetails();
        System.out.println("Lecturer pays: " + lecturer.getAccommodationPrice());
    }
}
