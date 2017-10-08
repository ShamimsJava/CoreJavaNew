package shamim.fundamentals2;

import shamim.fundamentals.Fundamentals;
import shamim.fundamentals.Multiplication;

public class Fundamentals2 {
    public static void main(String[] args) {
        Fundamentals f = new Fundamentals();
        System.out.println("The sum is: "+f.add(10, 20));
        
        Multiplication m = new Multiplication();
        System.out.println("The multiplication is: "+m.mult(50, 5));
    }
}
