package creational.builder;

import creational.builder.html.HtmlDocument;
import creational.builder.html.HtmlImage;
import creational.builder.html.HtmlParagraph;

public class HTMLDocumentBuilder implements DocumentBuilder {
    private final HtmlDocument document = new HtmlDocument();

    @Override
    public void addText(Text text) {
        document.add(new HtmlParagraph(text.getContent()));
    }

    @Override
    public void addImage(Image image) {
        document.add(new HtmlImage(image.getSource()));
    }

    @Override
    public String getDocument() {
        return document.toString();
    }
}
