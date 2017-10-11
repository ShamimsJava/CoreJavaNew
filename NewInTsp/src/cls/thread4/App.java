package cls.thread4;

public class App {
    public static void main(String[] args) {
        new TestThreadYield("Thread 1");
        new TestThreadYield("Thread 2");
        new TestThreadYield("Thread 3");
    }
}
