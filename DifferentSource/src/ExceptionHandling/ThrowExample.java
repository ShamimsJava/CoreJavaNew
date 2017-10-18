package ExceptionHandling;

public class ThrowExample {
    public static void validate(int x){
        if(x<18){
            throw new ArithmeticException("Your age is under 18.");
        }else{
            System.out.println("Welcome, you are voter.");
        }
    }
    
    public static void main(String[] args) {
        try {
            validate(15);
        } catch (ArithmeticException e) {
            System.out.println("Your are not voter. "+e);
        }
    }
}
