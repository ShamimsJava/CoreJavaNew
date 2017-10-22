package arraySorting;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingExample {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row of array: ");
        int row = sc.nextInt();
        System.out.print("Enter the column of array: ");
        int column = sc.nextInt();
        int[][] data = new int[row][column];
        
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data.length; j++){
                System.out.print("data["+i+"]["+j+"] : ");
                data[i][j] = sc.nextInt();
            }
        }
        System.out.println("======== Data table with sorting =========");
        for (int[] d : data) {
            Arrays.sort(d);
            for(int a:d){
                System.out.print("\t"+a+" ");
            }
            System.out.println();
        }
    }
}
