package loopingProgram;

import java.util.Scanner;

/**
 *
 * @author Shamim
 */
public class OddEvenUsingWhileLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i != 0) {
            System.out.println("Enter a value: ");
            i = sc.nextInt();
            if (i % 2 == 0) {
                System.out.println("This number is even.");

            } else {
                System.out.println("This number is odd.");
            }
        }
        System.out.println("You exit");
    }
}
