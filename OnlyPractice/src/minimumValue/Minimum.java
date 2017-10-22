package minimumValue;

import java.util.Arrays;

public class Minimum {
    public static void main(String[] args) {
        int a[] = {50,20,52,46,25};
        Arrays.sort(a);
        int x = a.length-1;
        System.out.println("Minimum: "+a[0]);
        System.out.println("Maximum: "+a[x]); 
    }
}
