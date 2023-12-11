package decorator;

public class Main {
    public static void main(String[] args) {
        Car sportCar = new SportCar(new BasicCar());
        sportCar.assemble();

        System.out.println();

        Car luxuryCar = new LuxuryCar(new BasicCar());
        luxuryCar.assemble();

        System.out.println();

        Car luxurySportCar = new LuxuryCar(new SportCar(new BasicCar()));
        luxurySportCar.assemble();

        System.out.println();

        Car sportLuxuryCar = new SportCar(new LuxuryCar(new BasicCar()));
        sportLuxuryCar.assemble();
    }
}
