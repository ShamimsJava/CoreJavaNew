package shamim.stringClass;

import java.util.Date;

public class StringClass {
    int x = 10; // we can not create object from primitive data type
    
    Integer xx = new Integer(x); // boxing
    Integer xxx = x; // autoboxing
    
    int a = xxx; // unboxing
    
    String y = "Shamim";
    String yy = new String("Shamim");
    Date d = new Date();
    
    public static void main(String[] args) {
        StringClass obj = new StringClass();
        System.out.println(obj.y);
        System.out.println(obj.yy);
        System.out.println(obj.x);
    }
}