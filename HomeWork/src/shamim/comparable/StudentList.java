package shamim.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student("Shamim", "Sarker", 101, 3.24));
        al.add(new Student("Liton", "Mia", 102, 3.69));
        al.add(new Student("Harry", "Jhone", 103, 3.50));
        
        Collections.sort(al);
        for(Student st : al){
            System.out.println(st.studentID+"       "+st.firstName+"        "+st.lastName+"     "+st.GPA);
        }
    }
}
