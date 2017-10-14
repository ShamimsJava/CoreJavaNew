package ThreadBasics;

class NewThread2 extends Thread{

    public NewThread2() {
        super("Demo Thread");
        System.out.println("Child Thread: "+this);
        this.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                
            }
        } catch (Exception e) {
        }
    }
    
    
    
}
public class ThreadDemo {
    
}
