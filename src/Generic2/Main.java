package Generic2;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user);

        Validator<String> nameValidator = new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return  Objects.nonNull(input) && !input.isEmpty() && Character.isUpperCase(input.charAt(0));
            }
        };

        user.setFirstName("Bogdan", nameValidator);
        System.out.println(user);
        System.out.println("----------------");

        user.setLastName("Ionescu", nameValidator);
        System.out.println(user);
        System.out.println("--------------");

        Validator<Integer> ageValidator = new Validator<Integer>() {
            @Override
            public boolean validate(Integer input) {
                return input.compareTo(0) >= 0 && input.compareTo(150) < 0;
                // input.compareTo(ceva) => input < ceva -> un numar < 0 , negativ
                // input.compareTo(ceva) => input > ceva -> un numar > 0 , pozitiv
                // input.compareTo(ceva) => input = ceva -> 0 , pentru egalitaate
            }
        };

        user.setAge(99, ageValidator);
        System.out.println(user);
        System.out.println("-------------");

        Validator<String> loginValidator = new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return Objects.nonNull(input) && input.trim().length() == 10;
            }
        };

        user.setLogin("1234567890", loginValidator);
        System.out.println(user);
        System.out.println("------------");

        Validator<String> passwordValidator = new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return  Objects.nonNull(input) && input.contains("!");
            }
        };

        user.setPassword("parola1!",passwordValidator);
        System.out.println(user);
        System.out.println("------------");
    }
}
