package cls.staticImport;

import static java.lang.Math.PI;

public class StaticImports {

    private double radius;

    public StaticImports(double radius) {
        this.radius = radius;
    }

    public double area() {
        return PI * radius * radius;
    }

    public double circumferance() {
        return 2 * PI * radius;
    }
    
    public static void main(String[] args) {
        StaticImports si = new StaticImports(5);
        System.out.println("The area is: "+si.area());
        System.out.println("The circumferance is: "+si.circumferance());
    }
}
