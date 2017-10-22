package conditionalExample;

import java.util.Scanner;

/**
 *
 * @author Shamim
 */
public class IfElseIfExmaple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 1;
        while (age != 0) {
            System.out.println("Enter your age: ");
            age = sc.nextInt();

            if (age > 25) {
                System.out.println("You are adult...");
            } else if (age > 18) {
                System.out.println("You are youth...");
            } else {
                System.out.println("You are immatured...");
            }
        }
    }
}

/*
System.in
System.err
System.out
*/
