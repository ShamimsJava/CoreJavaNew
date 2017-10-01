package shamim.module8;

public class AddArguments {
    public static void main(String[] args) {
        args = new String[3];
        args[0] = "10";
        args[1] = "20";
        args[2] = "30";
        int sum = 0;
        
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        System.out.println("Sum is: " + sum);
        
        for(int i = 0; i < args.length; i++){
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("Sum is: " + sum);
    }
}
