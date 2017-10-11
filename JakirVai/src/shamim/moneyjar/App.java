package shamim.moneyjar;

public class App {
    public static void main(String[] args) {
        MoneyJar mj = new MoneyJar();
        mj.purpose = "Helping Poor";
        mj.amount = 100;
        mj.target = 5000;
        mj.add(10);
        mj.add(10);
        mj.add(20);
         mj.add(20);
        System.out.println(mj.toString());
    }
    
    int m;
    String name;
    MoneyJar n;
}
