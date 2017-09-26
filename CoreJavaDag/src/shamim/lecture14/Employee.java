package shamim.lecture14;

import java.util.Date;

public class Employee {
    protected String name;
    protected double salary;
    protected Date birthDate;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public String getDetails(){
        return "Name: " + name + "\n"
                + "Salary: " + salary;
    }
}
