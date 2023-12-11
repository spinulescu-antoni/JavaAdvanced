package state;

public class TVStartState implements State{
    @Override
    public void doAction() {
        System.out.println("TV turn on ");
    }
}
