package shamim.module8;

public class TryCatchFinally {

    void method() {

        try {
            int[] id = new int[4];
            id[0] = 10;
            id[1] = 20 / 0;
            id[2] = 30;
            int sum = 0;
            for (int i = 0; i < id.length; i++) {
                sum += id[i];
            }
            System.out.println("The sum is: " + sum);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException is occured....");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException is occured.....");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException is occured.....");
        } catch (Exception e) {
            System.out.println("Exception is occured.....");
        } finally {
            System.out.println("Finally block is alltime displayed.....");
        }
    }

    public static void main(String[] args) {
        TryCatchFinally obj = new TryCatchFinally();
        obj.method();
    }
}
