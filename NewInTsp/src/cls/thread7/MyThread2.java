package cls.thread7;

public class MyThread2 extends Thread{
    SynchronizationEx1 t;
    MyThread2(SynchronizationEx1 t){
        this.t = t;
    }
    
    @Override
    public void run(){
        t.printTable(100);
    }
}
