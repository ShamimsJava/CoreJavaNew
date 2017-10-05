package shamim.comparablecollection;

public class Student implements Comparable<Student>{
    String firstName, lastName;
    int studentID;
    double GPA;

    public Student(String firstName, String lastName, int studentID, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.GPA = GPA;
    }

    @Override
    public int compareTo(Student st) {
        if(GPA == st.GPA)
            return 0;
        else if(GPA > st.GPA)
            return 1;
        else
            return -1;
    }
    
}
