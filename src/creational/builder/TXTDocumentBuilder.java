package creational.builder;

public class TXTDocumentBuilder implements DocumentBuilder{
    private final StringBuilder builder = new StringBuilder();

    @Override
    public void addText(Text text) {
        builder.append(text);
    }

    @Override
    public void addImage(Image image) {
        //No implementation
    }

    @Override
    public String getDocument() {
        return builder.toString();
    }


}
