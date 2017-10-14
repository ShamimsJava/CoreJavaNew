package cls.thread2;

public class ThreadController {
    private Runner r = new Runner();
    private Thread t = new Thread(r);
    public void startThread(){
        t.start();
    }
    public void stopThread(){
        r.stopRunning();
    }
}
