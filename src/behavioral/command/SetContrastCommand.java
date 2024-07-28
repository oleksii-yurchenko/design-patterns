package behavioral.command;

public class SetContrastCommand extends AbstractUndoableCommand{
    private float prevContrast;
    private float contrast;

    public SetContrastCommand(float contrast, VideoEditor service, History history) {
       super(service, history);
        this.contrast = contrast;
    }

    @Override
    protected void doExecute() {
        prevContrast = service.getContrast();
        service.setContrast(contrast);
    }

    @Override
    public void unexecute() {
        service.setContrast(prevContrast);
    }
}
