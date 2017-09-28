package cls.interfaceTestsolution;

public class Account implements Balance {
    double balance = 500000.0;
    
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public void checkbalance() {
        System.out.println("The balance is: "+balance);
    }
}
