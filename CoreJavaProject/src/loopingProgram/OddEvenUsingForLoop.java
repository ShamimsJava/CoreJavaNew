package loopingProgram;

import java.util.Scanner;

/**
 *
 * @author Shamim
 */
public class OddEvenUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(;;){
            int i = sc.nextInt();
            if(i%2==0){
                System.out.println("This number is even.");
            }else{
                System.out.println("This number is odd.");
            }
        }
    }
}
