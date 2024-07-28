package behavioral.chainOfResponsibility;

public class ImportHandlerFactory {
    public static ImportHandler getStartImportHandler(){
        var numbersHandler = new ImportNumbersHandler(null);
        var xlsHandler = new ImportXLSHandler(numbersHandler);
        var qbwHandler = new ImportQBWHandler(xlsHandler);

        return qbwHandler;
    }
}
