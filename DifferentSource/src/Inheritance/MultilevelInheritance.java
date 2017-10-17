package Inheritance;

class AA {

    int a = 10;
    int total = 0;

    void superMethod() {
        System.out.println("Value of a is: " + a);
        System.out.println("Total is: " + total);
    }
}

class BB extends AA {

    int b = 20;

    void subMethod() {
        total = a + b;
        System.out.println("Value of a is: " + a);
        System.out.println("Value of b is: " + b);
        System.out.println("Total is: " + total);
    }
}

class CC extends BB {

    int c = 30;

    void subMethod2() {
        total = a + b + c;
        System.out.println("Value of a is: " + a);
        System.out.println("Value of b is: " + b);
        System.out.println("Value of c is: " + c);
        System.out.println("Total is: " + total);
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {
        AA aa = new AA();
        BB bb = new BB();
        CC cc = new CC();
        cc.superMethod();
        cc.subMethod();
        cc.subMethod2();
    }

}
