package behavioral.command;

public abstract class AbstractUndoableCommand implements UndoableCommand{
    protected VideoEditor service;
    protected History history;


    public AbstractUndoableCommand(VideoEditor service, History history) {
        this.service = service;
        this.history = history;
    }

    @Override
    public void execute() {
        doExecute();
        history.push(this);
    }

    protected abstract void doExecute();
}
