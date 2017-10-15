package shamim.test3;

import java.util.Scanner;

public class ResultSheet {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Written Mark");
        int written = s.nextInt();
        System.out.println("Enter Evidence Mark");
        int evidence = s.nextInt();
        int total = written + evidence;

        if (written >= 70 && evidence >= 30) {
            if (written > 100 || evidence > 50) {
                System.out.println("You cannot input over 100 and 50 respective");
            } else {
                System.out.println("You Marks is " + total + " And you are Passed");
            }
        }else{
            System.out.println("Your Marks is "+total+" and you are failed");
        }
    }
}
