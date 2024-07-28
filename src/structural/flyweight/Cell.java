package structural.flyweight;

public class Cell {
  private final int row;
  private final int column;
  private String content;
  private CellFormat format;

  public Cell(int row, int column) {
    this.row = row;
    this.column = column;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public CellFormat getFormat() { return format; }

  public void setFormat(CellFormat format) { this.format = format; }

  public void render() {
    System.out.printf("(%d, %d): %s [%s]\n", row, column, content, format.getFontFamily());
  }
}
