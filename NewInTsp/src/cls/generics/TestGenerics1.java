package cls.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class TestGenerics1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rahul");
        list.add("jai");
        //list.add(32);
        String s = list.get(0);
        System.out.println("element is: " + s);
        
        for(String al : list ){
            System.out.println(al);
        }
        
//        Iterator<String> itr = list.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }
    }
}
