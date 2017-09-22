package shamim.lecture2; // package statement

// main class declaration
public class App { // class block start

    Account myAcct;  // declaring a reference variable
    static Account myChildAcct; // declare class type static field

    // main method declaration
    public static void main(String[] args) { // main method block start
        Account myAcct = new Account("Me"); // creating an object
        myAcct.balance = 200.0; // assigning to a field
        myAcct.deposit(300.0); // invoking a method
        myAcct.withdraw(100.0); // invoking a method
        double myBalance; // declaring a primitive variable
        myBalance = myAcct.getBalance(); // invoke a method from myAcct object referenced by Account class
        System.out.println(myBalance); // print statement

        // using multiple reference
        myChildAcct = myAcct; 
        myChildAcct.withdraw(300.0); // invoking a method
        double myChildBalance; // declaring a primitive variable
        myChildBalance = myAcct.getBalance();
        System.out.println(myChildBalance);
    }
}
