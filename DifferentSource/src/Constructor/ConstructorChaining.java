package Constructor;

public class ConstructorChaining {
    ConstructorChaining(){
        System.out.println("From default constructor");
    }
    
    ConstructorChaining(String name){
        this(); // calling default constructor
        System.out.println("One parameter constructor called: "+name);
    }
    
    ConstructorChaining(String name, int id){
        this("Shamim");
        System.out.println("Name is: "+name+"\nId is: "+id);
    }
    public static void main(String[] args) {
        ConstructorChaining obj = new ConstructorChaining("Shihab", 101);
    }
}
