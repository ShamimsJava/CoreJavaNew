package conditionalExample;

import java.util.Scanner;

/**
 *
 * @author Shamim
 */
public class SwitchCaseExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        while (x != 0) {
            System.out.println("Enter 5 or 6 or 7:");
            x = sc.nextInt();
            switch (x) {
                case 5: {
                    System.out.println("You enter 5");
                    break;
                }
                case 6: {
                    System.out.println("You enter 6");
                    break;
                }
                case 7: {
                    System.out.println("You enter 7");
                    break;
                }
                default: {
                    System.out.println("You enter out of 5,6,7");
                }
            }
        }
    }
}
