package ExceptionHandling;

public class TryCatch {

    public static void main(String[] args) {
        try {
            int a, b;
            a = 5;
            b = a / 0;
        }catch(ArithmeticException e){
            System.out.println("Exception handled....");
        }
    }

}
