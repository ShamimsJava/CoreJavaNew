package shamim.module8;

public class AddArguments2 {
    public static void main(String[] args) {
        args = new String[3];
        args[0] = "10";
        args[1] = "twenty";
        args[2] = "30";
        System.out.println("First portion of the program.........");
        try {
            int sum = 0;
            for(int i = 0; i < args.length; i++){
                sum += Integer.parseInt(args[i]);
            }
            System.out.println("The sum is: "+sum);
        } catch (NumberFormatException e) {
            System.err.println("Exception handled........");
        }
        System.out.println("Rest of the program is running........");
    }
}
