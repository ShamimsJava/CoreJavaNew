package cls.thread8;

public class Datas {

    void printTable(int n) {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    } 
}
