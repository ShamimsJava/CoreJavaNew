package Practice;

import java.util.Scanner;

public class Logarithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,y,z;
        System.out.print("Enter the base of logarithm: ");
        y = sc.nextDouble();
        System.out.print("Enter the value to find logarithm: ");
        z = sc.nextDouble();
        x = (Math.log(z))/(Math.log(y));
        System.out.println("===========Result==========");
        System.out.println("log("+z+"): "+x);
    }
}
