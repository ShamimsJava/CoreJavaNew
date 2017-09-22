package shamim.lecture3;

public class WrapperClass {
    public static void main(String[] args) {
        int i = 472;
        Integer ii = new Integer(i); // this is called boxing
        Integer jj = i; // this is called autoboxing
        
        int j = ii.intValue(); // this is called unboxing
        int k = jj; // this is called autounboxing
        
        System.out.println(i);
        System.out.println(ii);
        System.out.println(jj);
        System.out.println(j);
        System.out.println(k);
    }
}
