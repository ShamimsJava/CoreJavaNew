package shamim.nestedClass;

public class Shahin {
    static int a = 10;
    public static void main(String[] args) {
                System.out.println("The value of a: "+Shahin.a);
                System.out.println("The value of b: "+Rahman.b);
                System.out.println("The value of c: "+Rahman.Shihab.c);
                System.out.println("The value of d: "+Rahman.Shihab.Sharar.d);
                System.out.println("-------------------");
            }
    static class Rahman{
        static int b = 20; 
        static class Shihab{
            static int c = 30;
            static class Sharar{
                static int d = 40;
            }
        }
    }
}

// static nested class

/*
Nested class
    1. Non-static nested class / inner class
        1. Local inner class / local class
        2. Anonymous inner class / anonymous class
    2. Static nested class

*/