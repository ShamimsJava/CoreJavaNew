package shamim.moneyjar;

public class MoneyJar {
    String purpose;
    double amount;
    double target;
    double surplus;
    
    void add(double sum){
        amount = amount + sum;
        surplus = amount - target;
        System.out.println("Now The amount is: " + amount);
        System.out.println("Present surplus is: "+surplus);
    }

    @Override
    public String toString() {
        return "MoneyJar{" + "purpose=" + purpose + ", amount=" + amount + ", target=" + target + ", surplus=" + surplus + '}';
    }

    
    
    
}
