package exceptionHandling;

public class MultipleCatchBlock {

    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            a[5] = 5;
        } catch (ArithmeticException e) {
            System.err.println("Task 1 is completed.");
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Task 2 is completed.");
        }catch(Exception e){
            System.err.println("Task 3 is completed.");
        }
    }
    
}

//At a time only one Exception is occured and at a time only one catch block is executed.
//All catch blocks must be ordered from most specific to most general i.e. catch for ArithmeticException must come before catch for Exception .

