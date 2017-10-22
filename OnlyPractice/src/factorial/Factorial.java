package factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a value for evaluate factorial: ");
            int n = sc.nextInt();
            int f = 1;
            for (int i = 1; i <= n; i++) {
                f *= i;
            }
            System.out.println(f);
        }
    }
}
