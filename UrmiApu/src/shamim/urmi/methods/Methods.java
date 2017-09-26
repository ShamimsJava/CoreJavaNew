package shamim.urmi.methods;

public class Methods {
    public double annualSalary(double salary){
        double annSal;
        annSal = salary*12+5000-3000;
        return annSal;
    }
    public void annualSalary(String name, double salary){
        
        System.out.println("The name is: "+name);
        System.out.println("The annual salary is: "+salary*12);
    }
    
}

/*
salary
salary * 12 + 5000 - 3000
*/