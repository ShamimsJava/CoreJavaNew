package shamim.exceptionHandling;

public class ExceptionHandling {

    public static void main(String[] args) {
        args = new String[4];

        args[0] = "1";
        args[1] = "2";
        // args[1] = "Two"; // to see the exception NumberFormatException
        args[2] = "3";
        args[3] = "4";
        int sum = 0;
        
        for(int i = 0; i<args.length; i++){
            sum += Integer.parseInt(args[i]);
        }
        
        for (String i : args) { // using enhanced for loop or for each loop
            sum += Integer.parseInt(i);
        }
        System.out.println("The sum is: " + sum);
    }
}
