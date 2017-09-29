package shamim.nestedClass;

public interface NestedInterface {
    void a();
    interface A{
        void b();
        interface B{
            void c();
        }
    }
}

class SimpleClass implements NestedInterface.A.B{

    @Override
    public void c() {
        System.out.println("c method is implemented....");
    }
}

interface Shamim extends NestedInterface.A{
    void d();
}

class SimpleClass2 implements Shamim{

    @Override
    public void d() {
        System.out.println("d method is implemented....");
    }

    @Override
    public void b() {
        System.out.println("b method is implemented....");
    }

}

class App{
    public static void main(String[] args) {
        SimpleClass obj1 = new SimpleClass();
        SimpleClass2 obj2 = new SimpleClass2();
        
        obj1.c();
        obj2.b();
        obj2.d();
    }
}