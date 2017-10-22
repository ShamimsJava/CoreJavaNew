package evidence;

import java.util.Scanner;

/**
 *
 * @author Shamim
 */
public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value within 5,6,7");
        int x = sc.nextInt();
        switch(x){
            case 5:
                System.out.println("You enter 5.");
                break;
            case 6:
                System.out.println("You enter 6.");
                break;
            case 7:
                System.out.println("You enter 7.");  
                break;
            default:
                System.out.println("You enter without 5,6,7");
        }
    }
}
