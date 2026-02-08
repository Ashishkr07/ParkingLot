package CommandDesignPattern;

import java.util.Stack;

public class Remote {

    Stack<Command> lastCommands;

    public void pressExecuteButton(Command command){
        command.execute();
        lastCommands.push(command);
    }

    public void pressUndoButton(){
        Command command = lastCommands.pop();
        command.undo();
    }
}
