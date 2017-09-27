package exceptionHandling;

public class NestedTryCatch {

    public static void main(String[] args) {
        try {
            try {
                System.out.println("Going to divide....");
                int b = 39 / 0;
            } catch (ArithmeticException e) {
                System.err.println(e);
            }

            try {
                int a[] = new int[5];
                a[5] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println(e);
            }
        } catch (Exception e) {
            System.err.println("Handeled");
        }
        System.out.println("Normal flow.....");
    }

}
