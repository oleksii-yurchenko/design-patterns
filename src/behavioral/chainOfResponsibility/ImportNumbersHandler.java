package behavioral.chainOfResponsibility;

public class ImportNumbersHandler extends ImportHandler {

    public ImportNumbersHandler(ImportHandler next) {
        super(next);
    }

    @Override
    protected void doHandle(ImportRequest request) {
        System.out.println("Reading data from a Numbers spreadsheet.");
    }

    @Override
    protected String getExtension() {
        return ".numbers";
    }
}
