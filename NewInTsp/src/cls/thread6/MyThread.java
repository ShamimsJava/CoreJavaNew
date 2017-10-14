package cls.thread6;

public class MyThread extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println("Bangladesh.");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            i++;
            if (i == 10) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
    }
}
