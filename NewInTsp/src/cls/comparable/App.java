package cls.comparable;

public class App {

    public static void main(String[] args) {
        Student s1 = new Student("Shamim", "Sarker", 101, 3.24);
        Student s2 = new Student("Shihab", "Sharar", 102, 3.50);
        System.out.println(s1.compareTo(s2));
    }

}
