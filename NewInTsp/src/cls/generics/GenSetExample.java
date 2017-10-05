package cls.generics;

import java.util.HashSet;
import java.util.Set;

public class GenSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("one");
        set.add("second");
        set.add("3rd");
        //set.add(new Integer(4));
        set.add("second"); // duplicate not added
        System.out.println(set);
    }
}
