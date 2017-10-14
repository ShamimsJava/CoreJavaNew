package shamim.keyboardInput;

public class FormattedOutput {
    public static void main(String[] args) {
        String name = "Shamim";
        int id = 1233274;
        double salary = 50000.0;
        
        System.out.printf("%s %5d %f%n", name, id, salary);
        
        String s = String.format("%s %5d %f%n", name, id, salary);
        System.out.print(s);
    }
}
