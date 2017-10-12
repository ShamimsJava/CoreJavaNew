package shamim.synchronization3;

public class Table {
    synchronized void printTable(int n){
        for (int i = 0; i < 5; i++) {
            System.out.println(n*i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

class TestSynchronization3{
    public static void main(String[] args) {
        final Table obj = new Table();
        
        Thread t1 = new Thread(){
            @Override
            public void run(){
                obj.printTable(5);
            }
        };
        
        Thread t2 = new Thread(){
            @Override
            public void run(){
                obj.printTable(100);
            }
        };
        
        t1.start();
        t2.start();
    }
}