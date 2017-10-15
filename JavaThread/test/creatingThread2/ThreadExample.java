package creatingThread2;

public class ThreadExample {
    public static void main(String[] args) {
        Thread1 obj1 = new Thread1();
        Thread2 obj2 = new Thread2();
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("MainThread "+i);
        }
    }
}

class Thread1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Bangladesh "+i);
        }
    } 
}

class Thread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("America "+i);
        }
    } 
}