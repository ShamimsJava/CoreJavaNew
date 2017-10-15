package shamim.test11;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] n = new int[2][3];
        System.out.println("Row 1");
        System.out.println("Enter Number");
        n[0][0] = sc.nextInt();
        System.out.println("Enter Number");
        n[0][1] = sc.nextInt();
        System.out.println("Enter Number");
        n[0][2] = sc.nextInt();

        System.out.println("Row 2");
        System.out.println("Enter Number");
        n[1][0] = sc.nextInt();
        System.out.println("Enter Number");
        n[1][1] = sc.nextInt();
        System.out.println("Enter Number");
        n[1][2] = sc.nextInt();
        sortingArray(n);

    }

    public static void sortingArray(int[][] n) {
        System.out.println("Result is: ");
        for (int[] d : n) {
            Arrays.sort(d);
            for (int a : d) {
                System.out.print(a + "\t");
            }
            System.out.println();
        }
    }
}
