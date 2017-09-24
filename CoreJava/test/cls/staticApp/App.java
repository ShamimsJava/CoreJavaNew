package cls.staticApp;

import cls.staticexample.StaticUse;

public class App {
    static{
        System.out.println("Hi I am static block.");
    }
   
    public static void main(String[] args) {
        System.out.println(StaticUse.x);
    }
    static{
        System.out.println("Hi I am static block.");
    }
    
    
}
