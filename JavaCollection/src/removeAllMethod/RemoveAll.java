package removeAllMethod;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveAll {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("shamim");
        al.add("shihab");
        al.add("shahin");
        
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("mark");
        al2.add("bill");
        
        al.addAll(al2);
        System.out.println(al);
        
        System.out.println("=============================");
        
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        al.removeAll(al2);
        System.out.println(al);
        
        System.out.println("================================");
        
        Iterator itr2 = al.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
