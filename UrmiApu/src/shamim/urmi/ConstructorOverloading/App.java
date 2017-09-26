package shamim.urmi.ConstructorOverloading;

public class App {
    public static void main(String[] args) {
        ConsOver co = new ConsOver();
        ConsOver co1 = new ConsOver(10);
        ConsOver co2 = new ConsOver(12,15);
        System.out.println(co.x);
        System.out.println(co1.x);
        System.out.println(co2.x +"\n"+co2.y);  
    }
}
