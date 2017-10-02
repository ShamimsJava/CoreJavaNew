package shamim.example1;

public class AddArguments {
    public static void main(String[] args) {
        System.out.println("First portion of the program.....");
        
        args = new String[3];
        args[0] = "1";
        args[1] = "two";
        args[2] = "3";
        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        System.out.println("The sum is: "+sum);
        
        System.out.println("Rest of the program......");
    }
}
