package creational.builder;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        var document = new Document();
        document.add(new Text("Hello World"));
        document.add(new Image("pic1.jpg"));

        document.export(new HTMLDocumentBuilder(), "export.html");

        // Only writes the text elements to the file
        document.export(new TXTDocumentBuilder(), "export.txt");
    }
}
