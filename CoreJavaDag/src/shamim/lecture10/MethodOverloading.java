package shamim.lecture10;

public class MethodOverloading {

    public void sum(int a, int b) {
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }

    public void sum(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("The sum is: " + sum);
    }

    public void sum(int a, int b, int c, int d) {
        int sum = a + b + c + d;
        System.out.println("The sum is: " + sum);
    }

    public void sum(double a, double b) {
        double sum = a + b;
        System.out.println("The sum is: " + sum);
    }
}

class App {

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.sum(10, 20);
        obj.sum(10, 20, 30);
    }

}
