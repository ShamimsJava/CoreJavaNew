package OddEven;

import java.util.Scanner;

public class OddEven {

    public static void checkOddEven(int x) {
        if (x == 0) {
            System.out.println(x + " is nutral number.");
        } else if (x % 2 == 0) {
            System.out.println(x + " is even number.");
        } else {
            System.out.println(x + " is odd number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number to check odd or even: ");
            checkOddEven(sc.nextInt());
        }
    }
}
