package patternExample;

public class Pattern_18 {
    public static void main(String[] args) {
        char i;
        char j;
        for(i='A'; i<='E';i++){
            for(j='E'; j>=i;j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
