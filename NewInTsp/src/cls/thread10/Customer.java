package cls.thread10;

public class Customer {
    double amount = 10000.0;
    synchronized void withdraw(double amount){
        System.out.println("going to withdraw...");
        if(this.amount < amount){
            System.out.println("less balance; waiting for deposite...");
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.amount -= amount;
        System.out.println("withdraw completed...");
    }
    synchronized void deposit(int amount){
        System.out.println("going to deposit...");
        this.amount += amount;
        System.out.println("deposit completed...");
        notify();
    }
}
