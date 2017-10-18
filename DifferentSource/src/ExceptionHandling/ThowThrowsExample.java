package ExceptionHandling;

class newException extends Exception{

}

public class ThowThrowsExample {
    static void method() throws newException{
        throw new newException();
    }
    
    public static void main(String[] args) {
        try {
            method();
        } catch (newException e) {
            System.out.println("New Exception caught: "+e);
        }
    }
}
