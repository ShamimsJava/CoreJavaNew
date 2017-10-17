package ExceptionHandling;

import java.util.Scanner;

public class TryMultipleCatch {
    public static void main(String[] args) {
        try {
            int a=5;
            int b;
            int arr[] = {1,2,3,4};
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 or 2 or 3: ");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    b = a/0;
                    break;
                case 2:
                    b=arr[0]/arr[5];
                    break;
                default:
                    System.out.println("Program executes without exception");
                    break;
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception divide by zero..");
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("ArrayIndexOutOfBoundsException occured...");
        }
    }
}
