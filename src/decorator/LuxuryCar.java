package decorator;

public class LuxuryCar extends CarDecorator{

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" + Features of luxury car");
    }

    public LuxuryCar(Car car) {
        super(car);
    }
}






