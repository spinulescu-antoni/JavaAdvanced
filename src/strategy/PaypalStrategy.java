package strategy;

public class PaypalStrategy implements PaymentStrategy {
    private String email;
    private String password;

    public PaypalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int suma) {
        System.out.println("Suma platita: " + suma + " cu paypal");
    }
}
