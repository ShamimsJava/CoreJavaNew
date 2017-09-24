package cls;

import java.util.Scanner;

public class ForSum {

    public void sum() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many subject in exam: ");
        n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Put the marks");
        System.out.println("----------------------------");

        for (int i = 0; i < n; i++) {
            System.out.print("Subject[" + i + "]");
            a[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println("----------------------------");
        System.out.println("Total marks is: " + sum);
    }
}
