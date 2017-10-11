// Java Thread example by extending Thread class

package shamim.ex1;

public class Multi extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is running..........");
    }
    
    public static void main(String[] args) {
        Multi t1 = new Multi();
        t1.start();
    }
}
