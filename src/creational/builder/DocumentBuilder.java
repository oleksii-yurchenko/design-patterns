package creational.builder;

public interface DocumentBuilder {
    void addText(Text text);
    void addImage(Image image);
    String getDocument();
}
