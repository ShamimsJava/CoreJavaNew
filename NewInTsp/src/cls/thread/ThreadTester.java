package cls.thread;

public class ThreadTester {
    public static void main(String[] args) {
        HelloRunner r = new HelloRunner();
        Thread t = new Thread(r);
        t.start();
        
        HelloRunner2 r2 = new HelloRunner2();
        Thread t2 = new Thread(r2);
        t2.start();
        
    }
}

class HelloRunner implements Runnable{
    int i;
    @Override
    public void run(){
        i = 0;
        while(true){
            System.out.println("Hello " + i++);
            if(i==50){
                break;
            }
        }
    }
}

class HelloRunner2 implements Runnable{
    int i;
    @Override
    public void run(){
        i = 0;
        while(true){
            System.out.println("Bangladesh " + i++);
            System.out.println("India " + i++);
            if(i==50){
                break;
            }
        }
    }
}