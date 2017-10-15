package shamim.test7;

import java.util.Scanner;

public class BiggerValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = sc.nextInt();
        System.out.println("Enter second number: ");
        int y = sc.nextInt();
        if(x>y){
            System.out.println(x+" is bigger than "+y);
        }else{
            System.out.println(x+" is smaller than "+y);
        }
    }
}
