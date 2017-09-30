package bd.exception;

public class Practice {
    public static void main(String[] args) {
        System.out.println("First portion of my program...........");
        
        try {
           int[] a = new int[5];
        a[5] = 10;
        System.out.println(a[5]); 
        } catch (Exception e) {
            System.err.println("Exception handled......");
        }
        
        
        System.out.println("Rest of the program.............");
    }
}

// There may be 52 build in Exception