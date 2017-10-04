package shamim.example1;

public class AddArguments3 {
    public static void main(String[] args) {
        args = new String[3];
        args[0] = "1";
        args[1] = "two";
        args[2] = "3";
        int sum = 0;
        for(String arg : args){
            try {
                sum += Integer.parseInt(arg);
            } catch (NumberFormatException e) {
                System.err.println("args["+arg+"] is not an Integer...");
            }
        }
        System.out.println("The sum is: "+sum);
        System.out.println("Rest of the program.............");
    }
}
