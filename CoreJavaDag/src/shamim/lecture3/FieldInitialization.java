package shamim.lecture3;

import java.util.Date;

public class FieldInitialization {

    int x;  // initialize field using default values
    double y; // initialize field using default values
    String z; // initialize field using default values
    Date date = new Date(); // initialize field using explicit values

    // in this program I use constructor overloading
    public FieldInitialization() {  // default constructor
    }

    public FieldInitialization(int xx, double yy, String zz) { // parameterized constructor
        x = xx;
        y = yy;
        z = zz;
    }
}

class App2 {

    public static void main(String[] args) {
        FieldInitialization obj1 = new FieldInitialization();
        System.out.println("Default initialization of x is: " + obj1.x);
        System.out.println("Default initialization of y is: " + obj1.y);
        System.out.println("Default initialization of z is: " + obj1.z);
        System.out.println("Explicit values initialization of date is: " + obj1.date + "\n");

        FieldInitialization obj2 = new FieldInitialization(10, 12.23, "Shamim");
        System.out.println("Initialization using constructor of x is: " + obj2.x);
        System.out.println("Initialization using constructor of y is: " + obj2.y);
        System.out.println("Initialization using constructor of z is: " + obj2.z);
        System.out.println("Explicit values initialization of date is: " + obj2.date);
    }
}
