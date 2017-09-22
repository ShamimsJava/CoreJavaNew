package shamim.lecture2;

public class Account {

    String customer;
    double balance;

    public Account(String name) {    // create a new instance of Account
        customer = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            balance = balance + sum;
        }
    }

    public void withdraw(double sum) {
        if (sum <= balance && sum > 0) {
            balance = balance - sum;
        }
    }

    public String getCustomer() {
        return customer;
    }

    public String getDetails() {
        return "Type: " + "Account\n"
                + "Customer: " + customer + "\n"
                + "Balance: " + balance;
    }
}
