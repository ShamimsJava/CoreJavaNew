package shamim.exceptionHandling;

public class FinallyBlock {
    public static void main(String[] args) {
        args = new String[4];

        args[0] = "1";
        args[1] = "2";
        //args[1] = "Two"; // to see the exception NumberFormatException
        args[2] = "3";
        args[3] = "4";
        int sum = 0;

        try {
            for (int i = 0; i < args.length; i++) {
                sum += Integer.parseInt(args[i]);
            }
            System.out.println("The sum is: " + sum);
        } catch (NumberFormatException nfe) {
            System.err.println("One Array element is not number");
        }finally{
            System.err.println("Finally block is always executed");
        }

    }
}
