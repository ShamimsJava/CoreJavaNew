package compare;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int x1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int x2 = sc.nextInt();
        
        if(x1>x2){
            System.out.println(x1+" is bigger.");
        }else{
            System.out.println(x2+" is bigger.");
        }
    }
}
