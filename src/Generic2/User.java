package Generic2;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String login;
    private String password;

    public void setFirstName(String firstName, Validator<String> firstNameValidator) {
        if (firstNameValidator.validate(firstName)) {
            this.firstName = firstName;
        }else {
            System.out.println("First name " + firstName + "is not valid!");
        }
    }

    public void setLastName(String lastName, Validator<String> lastNameValidator) {
        if (lastNameValidator.validate(lastName)) {
            this.lastName = lastName;
        }else {
            System.out.println("Last name " + lastName + "is not valid!");
        }
    }

    public void setAge(int age, Validator<Integer> ageValidator) {
        if (ageValidator.validate(age)) {
            this.age = age;
        }else {
            System.out.println("Age " + age + "is not valid!");
        }
    }

    public void setLogin(String login, Validator<String> loginValidator) {
        if (loginValidator.validate(login)) {
            this.login = login.trim();
        }else {
            System.out.println("Login" + login + "is not valid!");
        }
    }

    public void setPassword(String password, Validator<String> passwordValidator) {
        if (passwordValidator.validate(password)) {
            this.password = password;
        }else {
            System.out.println("Password " + password + "is not valid!");
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
