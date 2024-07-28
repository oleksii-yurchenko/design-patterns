package behavioral.memento;

import java.util.Stack;

public class DocumentHistory {
    private final Stack<DocumentState> history = new Stack<>();

    public void push(DocumentState state){
        history.push(state);
    }

    public DocumentState pop(){
        return history.pop();
    }
}
