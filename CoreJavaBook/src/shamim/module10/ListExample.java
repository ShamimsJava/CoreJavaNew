package shamim.module10;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("one");
        list.add("second");
        list.add("3rd");
        list.add(4);
        list.add(4); // duplicate is added
        list.add(5.23);
        System.out.println(list); 
    }
}

// ordered output
