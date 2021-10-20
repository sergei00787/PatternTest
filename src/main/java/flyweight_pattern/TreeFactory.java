package flyweight_pattern;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    static Map<String, TreeDetail> treeTypes = new HashMap<>();

    public static TreeDetail getTreeType(String name, Color color, String otherTreeData) {
        TreeDetail result = treeTypes.get(name);
        if (result == null) {
            result = new TreeDetail(name, color, otherTreeData);
            treeTypes.put(name, result);
        }
        return result;
    }
}
