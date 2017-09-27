package exceptionHandling;

public class ExceptionPropagation {

    void m() {
        int data = 50 / 0;
    }

    void n() {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args) {
        ExceptionPropagation obj = new ExceptionPropagation();
        obj.p();
        System.out.println("Normal flow...........");
    }
}
