package cls.wildCard;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<? super A> list = new ArrayList<>();
        list.add(new A("Shamim", 25));
        list.add(new B("Bill", 60));
        list.add(new C("Mark", 40));
        
        Iterator<A> itr = (Iterator<A>) list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().name);
           
        }
    }
}
