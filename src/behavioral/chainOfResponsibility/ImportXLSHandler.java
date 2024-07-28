package behavioral.chainOfResponsibility;

public class ImportXLSHandler extends ImportHandler {
    public ImportXLSHandler(ImportHandler next) {
        super(next);
    }

    @Override
    protected void doHandle(ImportRequest request) {
        System.out.println("Reading data from a XlS spreadsheet.");
    }

    @Override
    protected String getExtension() {
        return ".xls";
    }
}
