package JavaProgram;

import java.util.Scanner;

public class FactorialExample {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        long num = sc.nextInt();
        long fact = 1;
        for(long i = num; i>=1; i--){
            fact *= i;  
        }
        System.out.println("The factorial of "+num+" is: "+fact);
    }
}
