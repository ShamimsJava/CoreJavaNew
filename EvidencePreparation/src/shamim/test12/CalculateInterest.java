package shamim.test12;

import java.util.Scanner;

public class CalculateInterest {
    public static double calInt(double principle, double rate, double time){
        double interest = (principle*rate*time)/100;
        return interest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal: ");
        double p = sc.nextDouble();
        System.out.println("Enter the rate: ");
        double r = sc.nextDouble();
        System.out.println("Enter the time: ");
        double t = sc.nextDouble();
        double i = calInt(p,r,t);
        double total = p+i;
        System.out.println("Interest is: "+i+" and total amount is: "+total);
    }
}
