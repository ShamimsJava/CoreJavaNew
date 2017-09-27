package cls.Exception;

public class AddArguments3 {

    public static void main(String[] args) {
        args = new String[3];
        args[0] = "1";
        //args[1] = "2";
        args[1] = "Two"; // to see the exception
        args[2] = "3";

        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            try {
                sum += Integer.parseInt(args[i]);
            } catch (NumberFormatException nfe) {
                System.err.println("NumberFormatException is occured.");
            }
        }
        System.out.println("Sum is: " + sum);
    }
}
