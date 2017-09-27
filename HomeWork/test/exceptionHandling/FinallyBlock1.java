package exceptionHandling;

public class FinallyBlock1 {

    public static void main(String[] args) {
        try {
            //int data = 50/5; // finally example where exception doesn't occur.
            int data = 50 / 0; // finally example where exception occurs and not handled.
            System.out.println(data);
            //} catch (NullPointerException e) {
        } catch (ArithmeticException e) { // finally example where exception occurs and handled.
            System.err.println("Exception handled.....");
        } finally {
            System.err.println("Finally block is always executed..");
        }
        System.out.println("Rest of the code......");
    }

}

/*
For each try block there can be zero or more catch blocks, but only one finally block. 
The finally block will not be executed if program exits(either by calling System.exit() 
or by causing a fatal error that causes the process to abort). 
*/