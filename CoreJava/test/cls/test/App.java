package cls.test;

public class App {
    public static void main(String[] args) {
        Child cd = new Child();
        Father ft = new Father();
        ft.setName("Bill");
        ft.setProperty(50000000.0);
        System.out.println(ft.toString());
        
        cd.setName("Harry");
        cd.setAge(28.5);
        cd.setProperty(50000000.0);
        cd.expend(20000000.0);
        cd.income(10000000.0);
        System.out.println(cd.toString());
    }
}
