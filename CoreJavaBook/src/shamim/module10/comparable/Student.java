package shamim.module10.comparable;

public class Student implements Comparable {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        if (age == ((Student) o).age) {
            return 0;
        } else if (age > ((Student) o).age) {
            return 1;
        } else {
            return -1;
        }
    }

}
