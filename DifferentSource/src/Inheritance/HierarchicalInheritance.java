package Inheritance;

class A{
    int a = 10;
    int b = 20;
}

class B extends A{
    void doSum(){
        int sum = a+b;
        System.out.println("Addition is: "+sum);
    }
}

class C extends A{
    void doMultiplication(){
        int mul = a*b;
        System.out.println("Product is: "+mul);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        b.doSum();
        c.doMultiplication();
    }
}
