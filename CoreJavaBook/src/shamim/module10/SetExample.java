package shamim.module10;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("one");
        set.add("second");
        set.add("3rd");
        set.add(4);
        set.add(4); // no compile time error but duplicate not added in output
        set.add(5.23);
        System.out.println(set);   
    }
}

// unordered output