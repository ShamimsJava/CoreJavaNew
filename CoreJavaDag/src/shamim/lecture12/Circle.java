package shamim.lecture12;

import static java.lang.Math.PI;

public class Circle {
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public double area(){
        return PI*radius*radius;
    }
    
    public double circumferance(){
        return 2*PI*radius;
    }
}

class App{
    public static void main(String[] args) {
        Circle cr = new Circle(5.0);
        System.out.println("The value of area: "+cr.area());
        System.out.println("The value of circumferance: "+cr.circumferance());
    }
}