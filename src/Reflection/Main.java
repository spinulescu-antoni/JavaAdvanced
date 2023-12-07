package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.age = 22;
        System.out.println(student1.age);

        Class<?> studentClass = null;
        try {
            studentClass = Class.forName("Exceptions.Features.Annotation.Reflection.Student");
        } catch (ClassNotFoundException e) {
            System.out.println("Invalid class name");
        }

        System.out.println("All fields are: ");
        Field[] fields = studentClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("_______________");

        System.out.println("All methods are: ");
        Method[] methods = studentClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("_______________");

        System.out.println("All constructors are: ");
        Constructor[] constructors = studentClass.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        Field firstName = null;
        try {
            firstName = studentClass.getDeclaredField("firstName");
        } catch (NoSuchFieldException e) {
            System.out.println(e.getMessage());
        }
        if (firstName != null) {
            firstName.setAccessible(true);
            try {
                firstName.set(student1, "Mihai");
                System.out.println(student1);
            } catch (IllegalAccessException e) {
                System.out.println(e.getMessage());
            }
        }

        Method setFieldOfStudy = null;
        try {
            setFieldOfStudy = studentClass.getDeclaredMethod("setFieldOfStudy", String.class);
        } catch (NoSuchMethodException e) {
            System.out.println(e.getMessage());
        }
        if (Objects.nonNull(setFieldOfStudy)) {
            setFieldOfStudy.setAccessible(true);
        }
        try {
            setFieldOfStudy.invoke(student1, "Math");
            System.out.println(student1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            System.out.println(e.getMessage());
        }

        Constructor constructor = null;
        try {
            constructor = studentClass.getDeclaredConstructor(String.class, String.class, int.class, String.class);
        } catch (NoSuchMethodException e) {
            System.out.println(e.getMessage());
        }
        if (Objects.nonNull(constructor)) {
            constructor.setAccessible(true);
        }
        try {
            Student student2 = (Student) constructor.newInstance("Mihai", "Ionescu", 31, "Math");
            System.out.println(student2);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            System.out.println(e.getMessage());
        }

    }
}
