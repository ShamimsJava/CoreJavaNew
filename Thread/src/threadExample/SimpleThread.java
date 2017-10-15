package threadExample;

public class SimpleThread extends Thread{
    @Override
    public void run() {
        System.out.println("This is a thread......");
    }
    
    public static void main(String[] args) {
        SimpleThread t1 = new SimpleThread();
        t1.start();
    }
}
