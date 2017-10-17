package multidimentionalarray;

import java.util.Scanner;

public class MultiArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size: ");
        int row = sc.nextInt();
        System.out.print("Enter column size: ");
        int column = sc.nextInt();
        int[][] arr = new int[row][column];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("Enter the value of arr["+i+"]"+"["+j+"] = ");
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("The matrix is:");
        System.out.println("------------------------");
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
