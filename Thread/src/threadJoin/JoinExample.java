package threadJoin;

public class JoinExample extends Thread{
    @Override
    public void run(){
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("The number is: "+i);
        }
    }
    public static void main(String[] args) {
        JoinExample j1 = new JoinExample();
        JoinExample j2 = new JoinExample();
        JoinExample j3 = new JoinExample();
        j1.start();
        try {
           j1.join(1500);
        } catch (Exception e) {
            e.printStackTrace();
        }
        j2.start();
        j3.start();
    }
}
