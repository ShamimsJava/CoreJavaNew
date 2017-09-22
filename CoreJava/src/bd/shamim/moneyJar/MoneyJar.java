package bd.shamim.moneyJar;

public class MoneyJar {
    String purpose;
    double amount;
    double target;
    double surplus;
    
    void add(double sum){
        amount = amount + sum;
        surplus = amount - target;
        System.out.println("New amount is: "+amount);
        System.out.println("New surplus is: "+surplus);
    }
    
    double takeOut(double sum){
        double sumReturned = 0;
        if(amount >= sum){
            amount = amount - sum;
            sumReturned = sum;
        }else{
            sumReturned = amount;
            amount = 0;
        }
        surplus = amount - target;
        return sumReturned;
    }
    
    double getAmount(){
        return amount;
    }
    
    void setTarget(double newTarget){
        target = newTarget;
        surplus = amount - target;
        System.out.println("Target is: "+target);
        System.out.println("Surplus is: "+surplus);
    }
    
    double getTarget(){
        return target;
    }
}
