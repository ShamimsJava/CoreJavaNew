package shamim.constructor;

public class App {
    public static void main(String[] args) {
       ConstructorExample obj = new ConstructorExample();
       ConstructorExample obj2 = new ConstructorExample(15,20);
       obj.x = 10; 
       obj.y = 12;
       
       obj2.x  = 50;
       System.out.println(obj2.x);
       
       
    }
}
