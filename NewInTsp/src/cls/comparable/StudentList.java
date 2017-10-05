package cls.comparable;

import java.util.TreeSet;

public class StudentList {

    public static void main(String[] args) {
        TreeSet studentSet = new TreeSet();
        studentSet.add(new Student("Shamim", "Sarker", 101, 4.0));
        studentSet.add(new Student("Ramim", "Mia", 102, 3.50));
        studentSet.add(new Student("Hamim", "Chawdhury", 103, 3.75));
        studentSet.add(new Student("Shamsu", "Malik", 104, 3.10));

        Object[] studentArray = studentSet.toArray();
        Student s;
        for (Object obj : studentArray) {
            s = (Student) obj;
            System.out.println("FirstName = " + s.firstName()
                    + ", LastName = " + s.lastName()
                    + ", ID = " + s.studentID()
                    + ", GPA = " + s.GPA());
        }
    }
}