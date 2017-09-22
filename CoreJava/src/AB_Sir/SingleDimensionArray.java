package AB_Sir;

import java.util.Arrays;

public class SingleDimensionArray {
    public static void main(String[] args) {
        int a[] = new int[3]; // array declaration named a, this is single dimension array 
        a[0] = 1; // assign value to array a
        a[1] = 2; // before assign value the array is already initialized by zero
        a[2] = 3;
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        
        System.out.println("\n"); // new line escape character
        
        int num[] = {50,200,5,82,25,63}; // array declaration named num and assign value
        Arrays.sort(num);
        for(int j=0; j<num.length; j++){
            System.out.print(num[j]+" ");
        }
    }
}
