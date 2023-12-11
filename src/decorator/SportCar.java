package decorator;

public class SportCar extends CarDecorator{

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" + Features sport car");
    }

    public SportCar(Car car) {
        super(car);
    }
}






