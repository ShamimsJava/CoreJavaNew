package patternExample;

public class Pattern_13 {
    public static void main(String[] args) {
        for (int i = 'A'; i <= 'F'; i++) {
            for (int j = 'A'; j <= i; j++) {
                System.out.print((char)i);
            }
            System.out.println();
        }
    }
}
