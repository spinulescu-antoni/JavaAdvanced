package state;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        State startState = new TVStartState();
        State stopState = new TVStopState();
        tv.setTvState(startState);
        tv.doAction();

        System.out.println("----------------");

        tv.setTvState(stopState);
        tv.doAction();
    }
}
