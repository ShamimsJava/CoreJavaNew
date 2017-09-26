package shamim.inheritence;

public class Employee {
    String name;
    double salary;
}

class Manager extends Employee {
    double age;
}

class App{
    public static void main(String[] args) {
        Employee mm = new Manager();
        Employee ee  = new Employee();
        ee.name = "Zakir";
        
        mm.name = "Shamim";
        mm.salary = 25000.0;
        
        System.out.println("name: "+ee.name
        +" salary "+mm.salary);
    }
}


// int Integer
// Float
// String sfasf;