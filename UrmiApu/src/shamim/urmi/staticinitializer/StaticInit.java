package shamim.urmi.staticinitializer;

import static java.lang.Math.PI;

public class StaticInit {
    static int x = 10;
    static int y = 20;
    
    public static double getArea(double r){
        return PI*r*r;
    }
}

class App{
    public static void main(String[] args) {
        System.out.println("The value of x: "+StaticInit.x);
        System.out.println("The value of y: "+StaticInit.y);
        
        System.out.println("The area of circle is: "+StaticInit.getArea(5.0));
        
    }
}