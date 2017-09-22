package JavaProgram;

import java.util.Scanner;

public class PrimeExample {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int i, m = 0, flag = 0;
        System.out.print("Please enter a number: ");
        int n = sc.nextInt();//it is the number to be checked  
        
        if (n != 0 && n != 1) {
            m = n / 2;
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println("Number is not prime");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Number is prime");
            }
        } else {
            System.out.println("Number is not prime");
        }
    }
}
