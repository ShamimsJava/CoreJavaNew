package loopingProgram;

import java.util.Scanner;

/**
 *
 * @author Shamim
 */
public class WhileLoopExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while( i != 1){
            System.out.println("You are inside while loop.");
            System.out.println("Press 1 to exit from loop.");
            i = sc.nextInt();
        }
        System.out.println("You are out of while loop.");
    }
}
