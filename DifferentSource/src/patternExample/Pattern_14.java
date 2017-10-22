package patternExample;

public class Pattern_14 {
    public static void main(String[] args) {
        char i;
        char j;
        for(i='A'; i<= 'E'; i++){
            for(j='A';j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
