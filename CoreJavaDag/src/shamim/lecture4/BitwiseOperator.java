package shamim.lecture4;

public class BitwiseOperator {

    public static void main(String[] args) {
        int a = 60; // 60 = 111100
        int b = 13; // 13 = 001101
        int c;

        c = a & b; // bitwise and
        System.out.println("a & b = " + c + " which binary value is = " + Integer.toBinaryString(c));
        c = a | b; // bitwise or
        System.out.println("a | b = " + c + " which binary value is = " + Integer.toBinaryString(c));
        c = a ^ b; // bitwise xor
        System.out.println("a ^ b = " + c + " which binary value is = " + Integer.toBinaryString(c));
        c = ~a; // bitwise complement
        System.out.println("~a = " + c + " which binary value is = " + Integer.toBinaryString(c));
        c = a << 2; // bitwise left shift
        System.out.println("a << 2 = " + c + " which binary value is = " + Integer.toBinaryString(c));
        c = a >> 2; // bitwise right shift
        System.out.println("a >> 2 = " + c + " which binary value is = " + Integer.toBinaryString(c));
        c = a >>> 2; // bitwise unsigned right shift
        System.out.println("a >>> 2 = " + c + " which binary value is = " + Integer.toBinaryString(c));
    }
}
