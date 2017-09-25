package Employee;

public class Employee {
    // step 2
    public String name;
    public double salary;
    
    // step 3

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getDetails() {
        return "Employee{" + "name=" + name + ", salary=" + salary + '}';
    }
    
}
