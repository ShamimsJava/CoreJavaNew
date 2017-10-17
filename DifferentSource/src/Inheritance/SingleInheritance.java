package Inheritance;

class SuperClass{
    int a = 10;
    void superMethod(){
        System.out.println("This is super class output: "+a);
    }
}

class Subclass extends SuperClass{
    void subMethod(){
        System.out.println("This is subclass output: "+a);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Subclass obj = new Subclass();
        obj.superMethod();
        obj.subMethod();
    }
}
