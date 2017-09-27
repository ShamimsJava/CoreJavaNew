package exceptionHandling;

public class ArithmeticExceptionEx {

    public static void main(String[] args) {
        System.out.println("Top portion of the program..................");
        try {
            int x = 50 / 0;
        } catch (ArithmeticException a) {
            System.err.println("Wrong number form.");
        }
        System.out.println("Last portion of the program...................");
    }

}
