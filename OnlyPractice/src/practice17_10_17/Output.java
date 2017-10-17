package practice17_10_17;

import java.util.Scanner;

public class Output {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter arr["+i+"] : ");
            arr[i] = sc.nextInt();
        }
        
        int sum = 0;
        for (int i = 0; i<arr.length; i++) {
            System.out.println("arr["+i+"] : "+arr[i]);
            sum = sum + arr[i];
            
        }
        System.out.println("Sum of this array is: "+sum);
    }
}
