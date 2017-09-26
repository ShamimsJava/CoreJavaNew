
package Practice;

import java.util.Scanner;

public class PracticeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        Access.q = sc.nextInt();
        System.out.println("The value of q: "+Access.q);
        
        Access ac = new Access();
        ac.x = 30;
    }
}
