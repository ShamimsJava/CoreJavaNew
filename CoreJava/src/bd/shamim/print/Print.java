package bd.shamim.print;

public class Print {
    public static void main(String[] args) {
        prln("Hello world.");
        pr("Hello Shamim.");
    }
    
    public static void prln(Object obj){
        System.out.println(obj);
    }
    
    public static void pr(Object obj){
        System.out.print(obj);
    }
}
