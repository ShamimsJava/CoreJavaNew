package cls.thread9;

public class Datas {
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
