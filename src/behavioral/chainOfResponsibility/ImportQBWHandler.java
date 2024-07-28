package behavioral.chainOfResponsibility;

public class ImportQBWHandler extends ImportHandler {
    public ImportQBWHandler(ImportHandler next) {
        super(next);
    }

    @Override
    protected void doHandle(ImportRequest request) {
        System.out.println("Reading data from a QBW spreadsheet.");
    }

    @Override
    protected String getExtension() {
        return ".qbw";
    }
}
