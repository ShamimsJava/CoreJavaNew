package cls.heterogeneous;

public class HeterogeneousCollection {
    public static void main(String[] args) {
        Employee[] staff = new Employee[1024];
        staff[0] = new Manager();
        staff[1] = new Employee();
        staff[2] = new Engineer();
    }
}
