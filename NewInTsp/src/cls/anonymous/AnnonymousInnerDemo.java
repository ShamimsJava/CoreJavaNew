package cls.anonymous;

public class AnnonymousInnerDemo {

    public static void main(String[] args) {
        B b = new B() {
            @Override
            public void displayMsg() {
                System.out.println("Hi, I am a method from class A, but overrided.");
            }
        };
        b.displayMsg();
        
        
    }
}
