package behavioral.chainOfResponsibility;

public abstract class ImportHandler {
    private ImportHandler next;

    public ImportHandler(ImportHandler next) {
        this.next = next;
    }

    public void handle(ImportRequest request){
        if (request.filename.endsWith(getExtension()))
        {
            doHandle(request);
            return;
        }

        if (next != null)
            next.handle(request);
        else
            throw new UnsupportedOperationException("Import is not supported");
    }

    protected abstract void doHandle(ImportRequest request);

    protected abstract String getExtension();
}
