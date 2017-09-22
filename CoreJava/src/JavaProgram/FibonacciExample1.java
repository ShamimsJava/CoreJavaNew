package JavaProgram;

import java.util.Scanner;

public class FibonacciExample1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //Fibonacci Series in Java without using recursion
        System.out.print("Please enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Please enter second number: ");
        int n2 = sc.nextInt();
        int n3;
        System.out.print(n1+" "+n2+" ");
        for(int i = 1; i <= 10; i++){
            n3 = n1 + n2;
            System.out.print(n3+" ");
            n1 = n2;
            n2 = n3;
        }
        
        //Fibonacci Series using recursion in java https://www.javatpoint.com/fibonacci-series-in-java problem
    }
}
