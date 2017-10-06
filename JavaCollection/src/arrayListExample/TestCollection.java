package arrayListExample;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); // creating arraylist
        list.add("shamim"); // adding object in arraylist
        list.add("Shihab");
        list.add("Mark");
        list.add("Bill");
        list.add("Steve");
        
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("================================");
        
        for(String obj : list){
            System.out.println(obj);
        }
    }
}
