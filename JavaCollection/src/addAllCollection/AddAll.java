package addAllCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class AddAll {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("shamim");
        al.add("ravi");
        al.add("mark");
        
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("bill");
        al2.add("steve");
        
        al.addAll(al2);
        
        Iterator itr = al.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
