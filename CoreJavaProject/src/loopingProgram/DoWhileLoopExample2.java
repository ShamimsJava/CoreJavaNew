package loopingProgram;

import java.util.Scanner;

/**
 *
 * @author Shamim
 */
public class DoWhileLoopExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        do{
            System.out.println("You are inside do-while loop.");
            System.out.println("Press 1 to exit from loop");
            i = sc.nextInt();
        }while(i != 1);
        System.out.println("You are out of do-while loop.");
    }
}
