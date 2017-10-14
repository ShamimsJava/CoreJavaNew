package cls.thread7;

public class SynchronizationEx1 {

    synchronized void printTable(int n) {
        for (int i = 0; i < 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}
