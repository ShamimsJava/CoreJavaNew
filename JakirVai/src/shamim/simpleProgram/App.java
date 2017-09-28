package shamim.simpleProgram;

public class App {
    public static void main(String[] args) {
        Greeting gt = new Greeting();
        Greeting gt2 = new Greeting(10);
        gt.greet();
        gt2.greet();
        
        Greeting.greet2();
    }
}
