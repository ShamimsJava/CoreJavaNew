package cls.comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorTest {

    public static void main(String[] args) {
        Student st1 = new Student("Mike", "Hauffmamn", 101, 4.0);
        Student st2 = new Student("John", "Lynn", 102, 2.8);
        Student st3 = new Student("Jim", "Max", 103, 3.6);
        Student st4 = new Student("Kelly", "Grant", 104, 2.3);
        Student st5 = new Student("Aelly", "Grant", 104, 2.3);

        Comparator c = new NameComp();
        TreeSet studentSet = new TreeSet(c);
        studentSet.add(st1);
        studentSet.add(st2);
        studentSet.add(st3);
        studentSet.add(st4);
        studentSet.add(st5);

        Object[] studentArray = studentSet.toArray();
        Student s;
        for (Object obj : studentArray) {
            s = (Student) obj;
            System.out.println("FirstName = " + s.firstName
                    + ", LastName = " + s.lastName
                    + ", ID = " + s.studentID
                    + ", GPA = " + s.GPA);
        }
    }
}
