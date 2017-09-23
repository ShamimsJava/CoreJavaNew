package bd.constructor;

public class App {
    public static void main(String[] args) {
        ConstructorExample obj = new ConstructorExample();
        obj.x = 10;
        obj.y = 20;
        System.out.println("x : "+obj.x);
        System.out.println("y : "+obj.y);
        
        ConstructorExample obj2 = new ConstructorExample(50,60);
        System.out.println("x : "+obj2.x);
        System.out.println("y : "+obj2.y);
        
        ConstructorExample obj3 = new ConstructorExample(55,65, 70);
        System.out.println("x : "+obj3.x);
        System.out.println("y : "+obj3.y);
        System.out.println("z : "+obj3.z);
        
        obj3.display();
    }
}
