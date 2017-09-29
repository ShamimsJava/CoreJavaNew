package shamim.nestedClass;

interface InterfaceExample{
    void drink();
}

abstract class Person {

    abstract void eat();
}

class TestAnonymousInner {

    public static void main(String[] args) {
        Person p = new Person() {
            @Override
            void eat() {
                System.out.println("nice fruits");
            }
        };
        p.eat();
        
//        InterfaceExample q = new InterfaceExample() {
//            @Override
//            public void drink() {
//                System.out.println("Please take it the glass of water.");
//            }
//        };
        
        InterfaceExample q = () -> { // lamda expression
            System.out.println("Please take it the glass of water.");
        };
        q.drink();
    }
}

// We can also use interfaces to create anonymous inner classes.