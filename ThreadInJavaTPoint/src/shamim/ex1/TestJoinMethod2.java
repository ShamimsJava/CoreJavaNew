package shamim.ex1;

public class TestJoinMethod2 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        TestJoinMethod2 t1 = new TestJoinMethod2();
        TestJoinMethod2 t2 = new TestJoinMethod2();
        TestJoinMethod2 t3 = new TestJoinMethod2();
        t1.start();
        try {
            t1.join(1500);
        } catch (Exception e) {
        }
        t2.start();
        t3.start();
    }
}
