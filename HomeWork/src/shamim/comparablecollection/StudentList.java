package shamim.comparablecollection;

import java.util.ArrayList;
import java.util.Collections;

public class StudentList {
    public static void main(String[] args) {
        
        ArrayList<Student> al = new ArrayList<Student>();
        
        al.add(new Student("Shamim1", "Sarker1", 101, 3.24));
        al.add(new Student("Shamim2", "Sarker2", 102, 3.50));
        al.add(new Student("Shamim3", "Sarker3", 103, 3.55));
        al.add(new Student("Shamim4", "Sarker4", 104, 3.20));
        al.add(new Student("Shamim5", "Sarker5", 105, 3.10));
        al.add(new Student("Shamim6", "Sarker6", 106, 3.75));
        
        System.out.println("ID        FName         LName         GPA");
        System.out.println("---------------------------------------------");
        
        Collections.sort(al);
        for(Student st : al){
            System.out.println(st.studentID+"       "+st.firstName+"        "+st.lastName+"     "+st.GPA);
        }
    }
}
