package conditionalProgram;

import java.util.Scanner;

/**
 *
 * @author Shamim
 */
public class SwitchCaseExampe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i != 0) {
            System.out.println("Enter any No. from 1 to 5 and enter 0 for exit: ");
            i = sc.nextInt();
            switch (i) {
                case 1: {
                    System.out.println("You enter one.");
                    break;
                }
                case 2: {
                    System.out.println("You enter two.");
                    break;
                }
                case 3: {
                    System.out.println("You enter three.");
                    break;
                }
                case 4: {
                    System.out.println("You enter four.");
                    break;
                }
                case 5: {
                    System.out.println("You enter five.");
                    break;
                }
                default: {
                    System.out.println("You not entered no. in range 1 to 5.");
                }
            }
        }
    }
}
