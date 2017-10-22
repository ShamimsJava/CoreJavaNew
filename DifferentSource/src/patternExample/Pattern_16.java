package patternExample;

public class Pattern_16 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
