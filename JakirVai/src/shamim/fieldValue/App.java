package shamim.fieldValue;

public class App {
    public static void main(String[] args) {
        FieldInitialization obj = new FieldInitialization();
        FieldInitialization obj2 = new FieldInitialization(50,60);
       
        System.out.println(obj2.x);
        System.out.println(obj2.y);
    }
}
