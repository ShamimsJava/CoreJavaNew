package Employee;

public class Manager extends Employee {

    private String departmentName;

    public Manager(String name, double salary, String departmentName) {
        super(name, salary);
        this.departmentName = departmentName;
    }
    
    @Override
     public String getDetails() {
         return "Employee{" + "name=" + name + ", salary=" + salary 
                + ", DepartmentName=" + departmentName + '}';
    }

}
