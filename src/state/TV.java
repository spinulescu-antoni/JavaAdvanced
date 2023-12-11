package state;

public class TV implements State{
    private State tvState;


    public void setTvState(State tvState) {
        this.tvState = tvState;
    }

    @Override
    public void doAction() {
        tvState.doAction();

    }
}
