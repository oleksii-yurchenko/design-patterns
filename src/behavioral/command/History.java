package behavioral.command;

import java.util.Stack;

public class History {
    private final Stack<UndoableCommand> commands = new Stack<>();

    public int size(){
        return commands.size();
    }

    public void push(UndoableCommand command){
        commands.push(command);
    }

    public UndoableCommand pop(){
        return commands.pop();
    }
}
