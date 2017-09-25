package cls.heterogeneous;

public class InstanceOf {
    public static void main(String[] args) {
        System.out.println("Ref is Employee and Constructor is Employee");
        Employee e = new Employee();
        doSomething(e);
        
        System.out.println("Ref is Employee and Constructor is Manager");
        Employee e2 = new Manager();
        doSomething(e2);
        
        
        System.out.println("Ref is Manger and Constructor is Manager");
        Manager m = new Manager();
        doSomething(m);
        
        System.out.println("Ref is Manger and Constructor is Manager");
        Engineer en = new Engineer();
        doSomething(en);
    }
    
    public static void doSomething(Employee e){
        if(e instanceof Manager){
            System.out.println("Manager");
        }else if(e instanceof Engineer){
            System.out.println("Engineer");
        }else{
            System.out.println("Employee");
        }
    }
}
