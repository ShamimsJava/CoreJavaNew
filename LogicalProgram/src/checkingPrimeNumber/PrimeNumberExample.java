package checkingPrimeNumber;

import java.util.Scanner;

public class PrimeNumberExample {

    public static void checkPrime(int num) {
        int flag = 0;
        if (num != 0 && num != 1) {
            int n = (int) Math.sqrt(num);
            for (int i = 2; i <= n; i++) {
                if (num % i == 0) {
                    flag = 1;
                } else {
                    flag = 0;
                }
            }
        } else {
            flag = 1;
        }
        if (flag == 0) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for checking prime.");
        checkPrime(sc.nextInt());
    }
}
