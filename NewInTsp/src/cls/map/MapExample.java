package cls.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("one", "1st");
        map.put("second", new Integer(2));
        map.put("third", "3rd");
        map.put("third", "III");
        Set set1 = map.keySet();
        Collection collection = map.values();
        Set set2 = map.entrySet();
        System.out.println(set1 + "\n" + collection + "\n" + set2);
    }
}
