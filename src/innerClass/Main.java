package innerClass;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer("Rex");
        Outer.Inner inner = outer.new Inner("Inner");

        Outer outer2 = new Outer("Tom");
        Outer.Inner inner2 = outer2.new Inner("MyInner");

        inner.print();
        System.out.println("----------");
        inner2.print();

        Outer.NestedStatic nestedStatic = new Outer.NestedStatic();
        System.out.println("-----------");
        nestedStatic.printStatic();

    }
}
