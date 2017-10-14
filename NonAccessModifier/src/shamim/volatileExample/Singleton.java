package shamim.volatileExample;

public class Singleton {

    private static volatile Singleton instance; //volatile variable 

    public static Singleton getInstance() {

        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }

        }
        return instance;

    }
    public static void main(String[] args) {
        System.out.println(getInstance());
    }

}
