package shamim.statements;

public class StatementDetails {
    public static void main(String[] args) {
        int x; // declaration statement
        x = 15; // assignment statement
        x = x + 5; // x + 5 ( simple expression statement)
        x = x * (5 * 5); // compound expression
        int y = 20;
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        
        int z = x / y;
        System.out.println("z = "+z);
        
        System.out.println("y = " + y--);
        System.out.println(--y);
        
        int xx = 13; // 1101
        int yy = 15; // 1111
        
//        System.out.println("Binary of 13: "+ Integer.toBinaryString(xx));
//        System.out.println("Binary of 15: "+ Integer.toBinaryString(yy));

        int mm = xx | yy;
        System.out.println("mm = "+mm); // 15 = 1111
        int mn = xx & yy;
        System.out.println("mn = "+mn); // 13 = 1101
        
        double d = 55.52;
        int i = (int)d; // casting (truncate in java )
        System.out.println(i);
        
        byte b1 = 12;
        byte b2 = 13;
        byte b3 = (byte)(b1 + b2);
        System.out.println("b3 = "+b3);
        
        char c1 = 'A';
        char c2 = 'B';
        int c3 = c1+c2;
        System.out.println("c3 = "+c3);
    }
   
}
