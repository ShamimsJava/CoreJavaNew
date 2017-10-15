package creatingThread;

public class ThreadExample {
    public static void main(String[] args) {
        Thread1 obj1 = new Thread1();
        Thread2 obj2 = new Thread2();
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        System.out.println("This is main thread.");
    }
}

class Thread1 implements Runnable{

    @Override
    public void run() {
        System.out.println("This is thread 2.");
    } 
}

class Thread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("This is thread 3.");
    } 
}