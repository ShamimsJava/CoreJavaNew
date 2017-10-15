package shamim.test5;

import java.util.Scanner;

public class checkPrime2 {
    public static void checkPrime(int num){
        int flag = 0;
        if(num != 0 && num != 1){
            int n = (int)Math.sqrt(num);
            for(int i = 2; i <= n; i++){
                if(num%i==0){
                    flag = 0;
                }else{
                    flag = 1;
                }
            }
        }else{
            flag = 0;
        }
        if(flag==0){
            System.out.println(num+" is not prime.");
        }else{
            System.out.println(num+" is prime.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for checking prime.");
        checkPrime(sc.nextInt());
    }
}
