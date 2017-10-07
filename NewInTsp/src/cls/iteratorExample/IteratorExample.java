package cls.iteratorExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Shamim", 25));
        list.add(new Student("Mark", 35));
        
        Iterator<Student> elements = list.iterator();
        while (elements.hasNext()){
            System.out.println(elements.next().getName());
        }
    }
}
