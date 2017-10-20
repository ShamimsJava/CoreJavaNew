package conditionalProgram;

import java.util.Scanner;

/**
 *
 * @author Shamim
 */
public class ifElseIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            if (age > 40 && age < 60) {
                System.out.println("You are old man.");
            } else if (age > 20 && age < 40) {
                System.out.println("You are youth.");
            } else if (age > 10 && age < 20) {
                System.out.println("You are adolescent.");
            } else {
                System.out.println("You are out of our survey.");
            }
        }
    }
}
