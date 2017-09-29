package shamim.nestedClass;

public class Shihab {
    int a = 10;
    class Sharar{
        int b = 20;
        class Shamim{
            int c = 30;
            class Sarker{
                int d = 40;
                class Beauty{
                    int e = 50;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Shihab obj1 = new Shihab();
        Shihab.Sharar obj2 = obj1.new Sharar();
        Shihab.Sharar.Shamim obj3 = obj2.new Shamim();
        Shihab.Sharar.Shamim.Sarker obj4 = obj3.new  Sarker();
        Shihab.Sharar.Shamim.Sarker.Beauty obj5 = obj4.new Beauty();
        
        System.out.println("The value of a: "+obj1.a);
        System.out.println("The value of b: "+obj2.b);
        System.out.println("The value of c: "+obj3.c);
        System.out.println("The value of d: "+obj4.d);
        System.out.println("The value of e: "+obj5.e);
    }
}

// non-static nested class or inner class

/*
Nested class
    1. Non-static nested class / inner class
        1. Local inner class / local class
        2. Anonymous inner class / anonymous class
    2. Static nested class

*/