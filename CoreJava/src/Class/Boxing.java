package Class;

import static java.lang.Integer.*;

public class Boxing {
    public static void main(String[] args) {
        String x = "26";
        String y = "10";
        String sum1 = x + y;
        System.out.println("The sum is (Actually concatenation): "+sum1);
        
        int sum2 = parseInt(x)+parseInt(y);
        System.out.println("The sum is: "+sum2);
    }
}
