package shamim.lecture14;

public class Manager extends Employee{
    protected String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    @Override
    public String getDetails(){
        return "Name: " + name + "\n"
                + "Salary: " + salary + "\n"
                + "Manager of: " + department;
    }
}
