package shamim.module10;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("one", "1st");
        map.put("second",new Integer(2));
        map.put("third", "3rd");
        map.put("third", "III");
        
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        
        Collection collection = map.values();
        Set set1 = map.keySet();
        Set set2 = map.entrySet();
        System.out.println(collection);
        System.out.println(set1);
        System.out.println(set2);
    }
}
