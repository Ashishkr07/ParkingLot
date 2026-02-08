package CommandDesignPattern;

public class Fan {

    State state;

    public Fan(State state) {
        this.state = state;
    }

    public void turnOn(){
        this.state = State.ON;
    };
    public void turnOff(){
        this.state = State.OFF;
    };
}
