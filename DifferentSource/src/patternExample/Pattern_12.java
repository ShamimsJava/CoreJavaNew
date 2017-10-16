package patternExample;

public class Pattern_12 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
