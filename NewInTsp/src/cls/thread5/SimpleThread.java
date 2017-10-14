package cls.thread5;

public class SimpleThread {
    public static void main(String[] args) throws InterruptedException{
        Thread t = new Thread();
        t.start();
        t.sleep(2000);
        t.setName("Shamim Thread");
        System.out.println("Thread Name: " + t.getName());
    }
}
