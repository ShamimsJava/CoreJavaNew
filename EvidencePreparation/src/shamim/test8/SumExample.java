package shamim.test8;

import java.util.Scanner;

public class SumExample {

    public static void calculate(int sn, int en) {
        int sum = 0;
        if (sn < en) {
            for (int i = sn; i <= en; i++) {
                sum += i;
            }
        } else {
            for (int i = en; i <= sn; i++) {
                sum += i;
            }
        }
        System.out.println("The sum is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int sn = sc.nextInt();
        System.out.println("Enter second number: ");
        int en = sc.nextInt();
        calculate(sn, en);
    }
}
