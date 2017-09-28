package cls.interfaceTest;

public class App {
    public static void main(String[] args) {
        Account ac = new Account(5000000.0, 3000000.0, 600000.0);
        System.out.println("Your previous balance is: "+ ac.blnce);
        System.out.println("You deposite now: "+ ac.deposit());
        System.out.println("Your withdraw: " + ac.withdraw());
        System.out.println("Now your balance is: "+ ac.checkBalance());
    }
}
