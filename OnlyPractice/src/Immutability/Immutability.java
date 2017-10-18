package Immutability;

public class Immutability {
    public static void main(String[] args) {
        int p = 420;
        
        Integer q = new Integer(p);
        int p2 = q.intValue();
        System.out.println(p2);
        
    }
}
