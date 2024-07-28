package behavioral.command;

public class SetTextCommand extends AbstractUndoableCommand{
    private String text;

    public SetTextCommand(String text, VideoEditor service, History history) {
      super(service, history);
        this.text = text;
    }

    @Override
    protected void doExecute() {
        service.setText(text);
    }

    @Override
    public void unexecute() {
        service.removeText();
    }
}
