package cls.thread3;

public class App {
    public static void main(String[] args) {
        Uncle uncle = new Uncle();
        Thread uncleThread = new Thread(uncle);
        uncleThread.setName("Mr. Jamil");
       // uncleThread.setPriority(10);
        uncleThread.start();
        
        Urmi urmi = new Urmi();
        Thread urmiThread = new Thread(urmi);
        urmiThread.setName("Miss. Urmi");
        //urmiThread.setPriority(10);
        urmiThread.start();
        
        System.out.println("uncleThread Name: " + uncleThread.getName());
        System.out.println("urmiThread Name: " + urmiThread.getName());
        System.out.println("uncleThread Priority: " + uncleThread.getPriority());
        System.out.println("urmiThread Priority: " + urmiThread.getPriority());
    }
}
