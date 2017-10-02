package shamim.module8;

public class AddArguments3 {
    public static void main(String[] args) {
        args = new String[3];
        args[0] = "10";
        args[1] = "twenty";
        args[2] = "30";
        int sum = 0;
        for(int i = 0; i<args.length; i++){
            try {
                sum += Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.err.println("args["+i+"] = "+args[i]+" is not integer....");
            }
        }
        System.out.println("The sum is: "+sum);
        System.out.println("Rest of the program........");
    }
}
