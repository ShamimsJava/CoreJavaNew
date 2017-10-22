package primeNumber;

import java.util.Scanner;

public class PrimeNumberChecking {
    public static void checkPrime(int num){
        int f = 0;
        if(num != 0 && num != 1){
            int n = (int)Math.sqrt(num);
            for(int i = 2; i <= n; i++ ){
                if(n%i==0){
                    f = 0;
                }else{
                    f = 1;
                }
            }
        }else{
            f = 1;
        }
        if(f==0){
            System.out.println("The number is prime.");
        }else{
            System.out.println("The number is not prime.");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a value for checking prime number: ");
            checkPrime(sc.nextInt());
        }
    }
}
