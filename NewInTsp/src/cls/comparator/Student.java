package cls.comparator;

public class Student {

    String firstName, lastName;
    int studentID = 0;
    double GPA = 0.0;

    public Student(String firstName, String lastName, int studentID, double GPA) {
        if (firstName == null || lastName == null || studentID == 0 || GPA == 0.0) {
            throw new IllegalArgumentException();
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.GPA = GPA;
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public int studentID() {
        return studentID;
    }

    public double GPA() {
        return GPA;
    }
}
