package shamim.urmi.boxing;

public class Boxing {
    public static void main(String[] args) {
        int x = 10;
        //Integer y = new Integer(x); // boxing
        
        Integer y = x; // autoboxing
        
        int z = y; // unboxing
        
        System.out.println(x);
        System.out.println(y);
    }
}

// byte, short, int, long, char, float, double, boolian
// Byte, Short, Integer, Long, Character, Float, Double, Boolean