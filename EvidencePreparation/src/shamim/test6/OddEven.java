package shamim.test6;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for checking odd even.");
        int x = sc.nextInt();
        if(x%2==0){
            System.out.println("The number is even....");
        }else{
            System.out.println("The number is odd....");
        }
    }
}
