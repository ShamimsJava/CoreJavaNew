package Class;

public class Test {
    String name;
    int age;
    double salary;
    String departmentName = "Software";

    public Test() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    
    void display(){
        System.out.println("Employee name: "+ name);
        System.out.println("Employee age: "+ age);
        System.out.println("Employee salary: "+ salary);
        System.out.println("Employee department name: "+ departmentName);
    }
}
