package bd.employee.address.addressType;

public class Employee {

    private int empId;
    private String empName;
    private Address address;

    public Employee(int empId, String empName, Address address) {
        this.empId = empId;
        this.empName = empName;
        this.address = address;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public Address getAddress() {
        return address;
    }

}
