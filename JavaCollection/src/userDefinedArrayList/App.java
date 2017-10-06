package userDefinedArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        // user defined class object
        Student s1 = new Student(101, "Shamim", 23);
        Student s2 = new Student(102, "Mark", 24);
        Student s3 = new Student(103, "Hanumat", 25);
        
        // creating arraylist
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(s1); // adding student class object
        al.add(s2);
        al.add(s3);
        
        // getting iterator
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            Student st = (Student)itr.next();
            System.out.println(st.rollno+"      "+st.name+"     "+st.age);
        }
    }
}
