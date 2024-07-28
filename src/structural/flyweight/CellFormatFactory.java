package structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CellFormatFactory {
    private Map<Integer, CellFormat> formats = new HashMap<>();

    public CellFormat getCellFormat(String fontFamily, int fontSize, boolean isBold){
        var hash = Objects.hash(fontFamily, fontSize, isBold);

        if (!formats.containsKey(hash)){
            formats.put(hash, new CellFormat(fontFamily, fontSize, isBold));
        }

        return formats.get(hash);
    }
}
