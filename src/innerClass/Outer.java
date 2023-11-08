package innerClass;

public class Outer {
    private String name;
    private static int number = 2;

    public Outer(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println(name);
    }
    public static void printNumber() {
        System.out.println(number);
    }

    class Inner{
        private String title;
        public Inner(String title) {
            this.title = title;;
        }
        public void print() {
            System.out.println(title + " " + name + " " + number);
            printName();
            printNumber();
        }
    }

    static class NestedStatic {
        public void printStatic() {
            System.out.println(number);
            printNumber();
        }
    }

}
