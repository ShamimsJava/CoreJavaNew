package shamim.constructor;

public class App {
    public static void main(String[] args) {
        ConstructorExample obj = new ConstructorExample();
        obj.x = 10;
        obj.y = 20;
        obj.z = 30;
        System.out.println("The value of x: "+obj.x);
        System.out.println("The value of y: "+obj.y);
        System.out.println("The value of z: "+obj.z);
        
        System.out.println("===============================");
        
        ConstructorExample obj1 = new ConstructorExample(40,50,60);
        System.out.println("The value of x: "+obj1.x);
        System.out.println("The value of y: "+obj1.y);
        System.out.println("The value of z: "+obj1.z);
        
        System.out.println("===============================");
        
        ConstructorExample.m = 70; // for static field we don't need to create object
        ConstructorExample.n = 80;
        System.out.println("The value of x: "+ConstructorExample.m);
        System.out.println("The value of y: "+ConstructorExample.n);
        
        System.out.println("===============================");
        
        obj.setX(90);
        System.out.println("The value of x: "+obj.getX());
        
        System.out.println("===============================");
    }
}
