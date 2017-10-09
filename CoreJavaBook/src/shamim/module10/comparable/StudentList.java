package shamim.module10.comparable;

import java.util.TreeSet;

public class StudentList {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(new Student("Mark", 25));
        set.add(new Student("Bill", 30));
        set.add(new Student("Steve", 23));
        set.add(new Student("Paul", 20));
        
        Object[] stArray = set.toArray();
        Student s;
        for (Object obj : stArray) {
            s = (Student)obj;
        }
    }
}
