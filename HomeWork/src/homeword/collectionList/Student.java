package homeword.collectionList;

public class Student {

    private int StudentId;
    private String StudentName;
    private Gender gender;
    private Location location;

    public Student(int StudentId, String StudentName, Gender gender, Location location) {
        this.StudentId = StudentId;
        this.StudentName = StudentName;
        this.gender = gender;
        this.location = location;
    }

    public int getStudentId() {
        return StudentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public Gender getGender() {
        return gender;
    }

    public Location getLocation() {
        return location;
    }
}
