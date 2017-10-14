package cls.thread7;

public class MyThread1 extends Thread{
    SynchronizationEx1 t;
    MyThread1(SynchronizationEx1 t){
        this.t = t;
    }
    
    @Override
    public void run(){
        t.printTable(5);
    }
}
