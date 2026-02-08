package CommandDesignPattern;

public class Ac {

    State state;

    public Ac(State state) {
        this.state = state;
    }

    public void turnOn(){
        this.state = State.ON;
    };
    public void turnOff(){
        this.state = State.OFF;
    };
}
