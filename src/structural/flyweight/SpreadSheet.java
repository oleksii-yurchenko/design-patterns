package structural.flyweight;

public class SpreadSheet {
  private final int MAX_ROWS = 3;
  private final int MAX_COLS = 3;
  private final CellFormat defaultFormat = new CellFormat("Times New Roman", 12, false);
  private final CellFormatFactory factory;

  private Cell[][] cells = new Cell[MAX_ROWS][MAX_COLS];

  public SpreadSheet(CellFormatFactory factory) {
    this.factory = factory;
    generateCells();
  }

  public void setContent(int row, int col, String content) {
    ensureCellExists(row, col);
    cells[row][col].setContent(content);
  }

  public void setFontFamily(int row, int col, String fontFamily) {
    ensureCellExists(row, col);

    var cell = cells[row][col];
    var format = cell.getFormat();

    cell.setFormat(factory.getCellFormat(fontFamily, format.getFontSize(), format.isBold()));

  }

  private void ensureCellExists(int row, int col) {
    if (row < 0 || row >= MAX_ROWS)
      throw new IllegalArgumentException();

    if (col < 0 || col >= MAX_COLS)
      throw new IllegalArgumentException();
  }

  private void generateCells() {
    for (var row = 0; row < MAX_ROWS; row++)
      for (var col = 0; col < MAX_COLS; col++) {
        var cell = new Cell(row, col);
        cell.setFormat(defaultFormat);
        cells[row][col] = cell;
      }
  }

  public void render() {
    for (var row = 0; row < MAX_ROWS; row++)
      for (var col = 0; col < MAX_COLS; col++)
        cells[row][col].render();
  }
}
