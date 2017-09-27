package cls.Exception;

public class AddArguments2 {
    public static void main(String[] args) {
        args = new String[3];
        args[0] = "1";
        //args[1] = "2";
        args[1] = "Two"; // to see the exception
        args[2] = "3";
        try {
            int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("Sum is: " + sum);
        } catch (NumberFormatException nfe) {
            System.err.println("NumberFormatException is occured.");
        }
    }
}
