package evidence;

import java.util.Scanner;

/**
 *
 * @author Shamim
 */
public class IfElseIfExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int x = 1;
        while (x != 0) {
            System.out.println("Enter a value:");
            x = sc.nextInt();
            if(x==0){
                System.out.println("The loop is terminated.");
            }
            else if (x % 2 == 0) {
                System.out.println("This number is even.");
            } else {
                System.out.println("This number is odd.");
            }
        }
    }
}

/*
System.in
System.out
System.err
*/
