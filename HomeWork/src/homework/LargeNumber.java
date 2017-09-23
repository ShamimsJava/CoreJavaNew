package homework;

import java.util.Scanner;

public class LargeNumber {

    public static void main(String[] args) {
        int m;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the array size: ");
        n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Please enter array elements: ");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        m = a[0];
        for (int i = 0; i < n; i++) {
            if (m < a[i]) {
                m = a[i];
            }
        }

        System.out.println("The array elements are: ");
        System.out.println("-----------------------");
        for (int x : a) {
            System.out.println(x);
        }

        System.out.println("The maximum value of this array is: ");
        System.out.println("-----------------------------------");
        System.out.println(m);

    }
}
