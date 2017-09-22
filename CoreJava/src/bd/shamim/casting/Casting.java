package bd.shamim.casting;

public class Casting {

    public static void main(String[] args) {
        long a = 15L;
        long b = 16L;
        int c = (int) (a + b);

        byte d = 20;
        byte e = 25;
        byte f = (byte) (d + e);

        short g = 5;
        short h = 6;
        short i = (short) (g + h);

        System.out.println("The value of c: " + c);
        System.out.println("The value of f: " + f);
        System.out.println("The value of i: " + i);
    }
}
