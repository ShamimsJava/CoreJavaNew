package Constructor;

public class Constructor {
    Constructor(){
        System.out.println("Hello from constructor.");
    }
    
    void method(){
        System.out.println("Hello from method.");
    }
    
    public static void main(String[] args) {
        Constructor obj = new Constructor();
        obj.method();
    }
}
