package sir.test;

public class Converter {
    static String x = "10";
    static int y = 5;
    static String y1 = Integer.toString(y);
    
    public static int addition(){
        int sum;
        sum = Integer.parseInt(x) + y;
        return sum;
    } 
    
    public static int subtraction(){
        int sub;
        sub = Integer.parseInt(x) - y;
        return sub;
    } 
    
    public static int division(){
        int div;
        div = Integer.parseInt(x) / y;
        return div;
    } 
}

class App{
    public static void main(String[] args) {
        System.out.println("Addition is: "+ Converter.addition());
        System.out.println("Subtraction is: "+ Converter.subtraction());
        System.out.println("Division is: "+ Converter.division());
        System.out.println("String value of y: "+ Converter.y1);
    }
}