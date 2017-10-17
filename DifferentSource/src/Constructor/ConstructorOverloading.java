package Constructor;

public class ConstructorOverloading {
    ConstructorOverloading(){
        System.out.println("From default constructor");
    }
    
    ConstructorOverloading(int i){
        System.out.println("Constructor with one arguments: "+i);
    }
    
    ConstructorOverloading(int i, int j){
        System.out.println("Constructor with two arguments: "+i+" and "+j);
    }
    
    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(10);
        ConstructorOverloading obj3 = new ConstructorOverloading(10,20);
    }
}
