package getsetName;

public class getSetNameExample extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is running....");
    }
    public static void main(String[] args) {
        getSetNameExample t1 = new getSetNameExample();
        getSetNameExample t2 = new getSetNameExample();
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println("After changing name.");
        t1.setName("Thread Example 1");
        t2.setName("Thread Example 2");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t1.getId());
        System.out.println(t2.getId());
        System.out.println(t1.getClass());
    }
}
