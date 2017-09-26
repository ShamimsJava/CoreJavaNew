package shamim.lecture14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();
        SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
        e.name = "Harry";
        e.setSalary(50000.0);
        m.name = "Mark";
        m.salary = 60000.0;
        String d = "26/09/2017";
        System.out.println(e.getDetails());
        System.out.println(d);
    }
}
