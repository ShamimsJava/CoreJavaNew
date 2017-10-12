package cls.thread7;

public class SynchronizationTestThread {
    public static void main(String[] args) {
        SynchronizationEx1 obj = new SynchronizationEx1();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
