package bd.shamim;

public class Employee {
    private String empName;
    private Address empAdd;

    public Employee(String empName, Address empAdd) {
        this.empName = empName;
        this.empAdd = empAdd;
    }

    public String getEmpName() {
        return empName;
    }

    public Address getEmpAdd() {
        return empAdd;
    }
    
}