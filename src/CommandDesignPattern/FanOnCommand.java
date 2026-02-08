package CommandDesignPattern;

public class FanOnCommand implements Command{

    Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }


    @Override
    public void execute() {
        fan.turnOn();
    }

    @Override
    public void undo() {
        fan.turnOff();
    }
}
