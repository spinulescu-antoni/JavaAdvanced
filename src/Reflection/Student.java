package Reflection;

public class Student {
    private String firstName;
    private String lastName;
    public int age;
    private String fieldOfStudy;

    private Student(String firstName, String lastName, int age, String fieldOfStudy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.fieldOfStudy = fieldOfStudy;
    }

    public Student(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    private void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName= '" + firstName + '\'' +
                ", lastName= '" + lastName + '\'' +
                ", age= " + age +
                ", fieldOfStudy= '" + fieldOfStudy + '\'' +
                '}';
    }
}
