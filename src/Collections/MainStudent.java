package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {

        Student student1 = new Student("Jhon", 19);
        Student student2 = new Student("Andrei", 20);
        Student student3 = new Student("Batman", 15);
        Student student4 = new Student("Elon", 24);
        Student student5 = new Student("Ana", 28);
        Student student6 = new Student("Batman", 14);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        System.out.println(students);

        Collections.sort(students);
        System.out.println(students);

        Comparator<Student> nameComparator = new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return student1.getName().compareTo(student2.getName());
            }
        };
        students.sort(nameComparator);
        System.out.println(students);

        Comparator<Student> nameComparatorDesc = nameComparator.reversed();
        students.sort(nameComparatorDesc);
        System.out.println(students);

        Comparator<Student> nameAndAgeComparator = new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                if (student1.getName().equals(student2.getName())) {
                    return Integer.compare(student1.getAge(), student2.getAge());
                }else
                    return student1.getName().compareTo(student2.getName());
            }
        };

        students.sort(nameAndAgeComparator);
        System.out.println(students);
    }
}