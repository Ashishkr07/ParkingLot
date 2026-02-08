package CommandDesignPattern;

public class Light {


    State state;

    public Light(State state) {
        this.state = state;
    }

    public void turnOn(){
        this.state = State.ON;
    };
    public void turnOff(){
        this.state = State.OFF;
    };
}
