package homework;

import java.util.Scanner;

public class SimpleLarge {
    public static void main(String[] args) {
        int m;
        int n;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array element");
        System.out.println("---------------------");
        
        for(int i=0; i<n; i++){
            System.out.println("Enter "+i+" element: ");
            a[i] = sc.nextInt();
        }
        
        m = a[0];
        for(int i=0; i<n; i++){
            if(m<a[i]){
                m = a[i];
            }
        }
        
        System.out.println("Your inputed array is: ");
        for(int i : a){
            System.out.print(i+", ");
        }
        System.out.println("\n"+"-------------------------");
        System.out.println("Maximum value of array is: "+m);
    }
}
