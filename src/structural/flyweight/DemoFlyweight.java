package structural.flyweight;

public class DemoFlyweight {
  public static void show() {
    var sheet = new SpreadSheet(new CellFormatFactory());
    sheet.setContent(0, 0, "Hello");
    sheet.setContent(1, 0, "World");
    sheet.setFontFamily(0, 0, "Arial");
    sheet.render();
  }
}
