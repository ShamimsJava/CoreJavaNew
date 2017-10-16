package example16;

class A {

    final public int calculate(int a, int b) {
        return 1;
    }
}

class B extends A {

//    @Override
//    public int calculate(int a, int b) { // compilation error
//        return 2;
//    }
}

public class Output {

    public static void main(String args[]) {
        B object = new B();
        // System.out.print("b is " + b.calculate(0, 1)); // compilation error
    }
}
