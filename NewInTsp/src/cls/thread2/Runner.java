package cls.thread2;

public class Runner implements Runnable{
    private boolean timeToQuit = false;
    
    @Override
    public void run() {
        while(!timeToQuit){
            
        }
    }
    public void stopRunning(){
        timeToQuit = true;
    }
    
}
