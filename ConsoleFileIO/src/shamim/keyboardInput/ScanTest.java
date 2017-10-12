package shamim.keyboardInput;

import java.util.Scanner;

public class ScanTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = s.next();
        System.out.println("Enter Your Salary: ");
        double salary = s.nextDouble();
        System.out.println("Mr. "+name+". Your salary is "+salary);
    }
}
