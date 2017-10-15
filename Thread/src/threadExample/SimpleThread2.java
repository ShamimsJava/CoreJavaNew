package threadExample;

public class SimpleThread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is running......");
    }
    
    public static void main(String[] args) {
        SimpleThread2 st = new SimpleThread2();
        Thread t1 = new Thread(st);
        t1.start();
    }
}
