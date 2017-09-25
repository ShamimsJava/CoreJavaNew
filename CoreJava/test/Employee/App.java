package Employee;

public class App {
    public static void main(String[] args) {
        Employee m = new Manager("Shamim", 50000, "Statistics");
        System.out.println(m.getDetails());
        Employee e = new Employee("Sarker", 54000);
        System.out.println(e.getDetails());
        Manager me = new Manager("Shihab", 45000, "Math");
        System.out.println(me.getDetails());
    }
}
