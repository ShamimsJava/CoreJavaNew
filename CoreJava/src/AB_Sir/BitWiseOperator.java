package AB_Sir;

public class BitWiseOperator {
    public static void main(String[] args){
        int a = 60; // 60 = 111100
        int b = 13; // 13 =   1101
        int c;

        c = a & b;
        System.out.println("a & b = "+c +" which binary value is = "+Integer.toBinaryString(c));
        c = a | b;
        System.out.println("a | b = "+c +" which binary value is = "+Integer.toBinaryString(c));
        c = a ^ b;
        System.out.println("a ^ b = "+c +" which binary value is = "+Integer.toBinaryString(c));
        c = ~a;
        System.out.println("~a = "+c +" which binary value is = "+Integer.toBinaryString(c));
        c = a << 2;
        System.out.println("a << 2 = "+c +" which binary value is = "+Integer.toBinaryString(c));
        c = a >> 2;
        System.out.println("a >> 2 = "+c +" which binary value is = "+Integer.toBinaryString(c));
        c = a >>> 2;
        System.out.println("a >>> 2 = "+c +" which binary value is = "+Integer.toBinaryString(c));
    }   
}
/*
* Bitwise Operation works with bit
* Integer is a public final class
* toBinaryString() is a public static method
*/