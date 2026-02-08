package CommandDesignPattern;

public class AcOffCommand implements Command{

    Ac ac;

    public AcOffCommand(Ac ac) {
        this.ac = ac;
    }


    @Override
    public void execute() {
        ac.turnOff();
    }

    @Override
    public void undo() {
        ac.turnOn();
    }
}
