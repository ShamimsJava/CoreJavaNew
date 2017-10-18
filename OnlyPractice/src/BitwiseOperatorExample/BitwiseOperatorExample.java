package BitwiseOperatorExample;

public class BitwiseOperatorExample {

    public static void main(String[] args) {
        int a = 13; // 01101
        int b = 17; // 10001
        
        int c = a & b;
        System.out.println(c); // 1
        //System.out.println(Integer.toBinaryString(b));
        
    }

}
