package shamim.nestedClass;

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
    }
}
