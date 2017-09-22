package bd.shamim.moneyJar;

public class App {
    public static void main(String[] args) {
        MoneyJar mj = new MoneyJar();
        mj.amount = 5000.0;
        mj.purpose = "Banking";
        mj.surplus = 3000.0;
        mj.target = 2000.0;
        mj.add(2500.0);
        System.out.println(mj.takeOut(8000.0));
        System.out.println(mj.getAmount());
        mj.setTarget(2000.0);
        mj.getTarget();
    }
}
