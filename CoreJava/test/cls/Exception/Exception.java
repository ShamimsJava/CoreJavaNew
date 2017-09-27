package cls.Exception;

public class Exception {

    public static void main(String[] args) {
        System.out.println("Hello Shamim............");
        try {
            int x = 10;
            int y = 0;
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException is occured.");
        }
        System.out.println("Hello Bangladesh...........");
    }
}
