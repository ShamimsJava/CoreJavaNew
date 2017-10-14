package shamim.ex1;

public class TestCallRun2 extends Thread{
    @Override
    public void run(){
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        TestCallRun2 t1 = new TestCallRun2();
        TestCallRun2 t2 = new TestCallRun2();
        t1.run();
        t2.run();
    }
}

/*
Here is no context-switching because here t1 and t2 will be threated as normal object not thread object.
If we use run() instead start()
Each thread starts in a separate call stack.
*/