package compare;

import java.util.Scanner;

public class CompareExample {
    public static int compare(int x, int y){
        if(x>y){
            return x;
        }else{
            return y;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two value: ");
        System.out.println("Big value is: "+compare(sc.nextInt(), sc.nextInt()));
    }
}
