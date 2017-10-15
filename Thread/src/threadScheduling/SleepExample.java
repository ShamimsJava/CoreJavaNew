package threadScheduling;

public class SleepExample extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("The number is: "+i);
        }
    }
    
    public static void main(String[] args) {
        SleepExample t1 = new SleepExample();
        SleepExample t2 = new SleepExample();
        t1.start();
        t2.start();
//        t1.run();
//        t2.run();
    }
}
