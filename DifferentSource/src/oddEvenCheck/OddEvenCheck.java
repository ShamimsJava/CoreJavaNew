package oddEvenCheck;

import java.util.Scanner;

public class OddEvenCheck {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        x = sc.nextInt();
        if(x%2==0){
            System.out.println("Number is even.");
        }else{
            System.out.println("Number is odd.");
        }
    }
}
