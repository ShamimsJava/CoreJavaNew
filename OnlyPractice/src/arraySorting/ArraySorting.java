package arraySorting;

import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        double arr[] = new double[sc.nextInt()];
        for(int i=0; i< arr.length; i++){
            System.out.println("arr["+i+"]: ");
            arr[i] = sc.nextDouble();
        }
        System.out.println("=========Array Result=========");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        
        for(int i=0; i<arr.length; i++){
            double max = arr[0];
            if(max>arr[i]){
                max = arr[i];
            }
        }
        
    }
}
