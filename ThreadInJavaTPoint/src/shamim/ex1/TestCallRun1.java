package shamim.ex1;

public class TestCallRun1 extends Thread{
    @Override
    public void run(){
        System.out.println("running.......");
    }
    public static void main(String[] args) {
        TestCallRun1 t1 = new TestCallRun1();
        t1.run();
    }
}
