package AB_Sir;

import static java.lang.Math.sqrt; // Static import in java


public class StaticImport {
    public static void main(String[] args) {
        System.out.println("The value of PI: "+Math.PI); // need to refer Math class because of static import
        System.out.println("The square root of 9 is: "+sqrt(9)); // need not to refer Math class because of static import
        System.out.println(Math.round(Math.random()*100));
        System.out.println(Math.pow(10, 2));
    }
}
