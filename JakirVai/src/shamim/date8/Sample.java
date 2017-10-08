package shamim.date8;

import java.util.Scanner;

public class Sample {
    int x; // field or instance variable
    static int m=54; // static variable or class variable
    

    public Sample() {
    }

    public Sample(int x) {
        this.x = x;
    }
    
    
    void method(int x){ // parameter variable
        int y=50; // local variable
        System.out.println(y);
        System.out.println("The value of x: "+x);
    }
    
//    public static void main(String[] args) {
//        int x = 17;
//        Sample obj = new Sample(541585);
//        System.out.println(obj.x);
//        obj.method(15);
//        System.out.println(x);
//        
//        System.out.println("The value of m: "+m);
//    }
}

class Sample2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("The value of m: "+Sample.m);
    }
}

/*
field, instance variable
parameter variable
local variable
class variable, static variable
non-static variable
*/