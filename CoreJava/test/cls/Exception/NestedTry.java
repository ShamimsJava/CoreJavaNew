package cls.Exception;

public class NestedTry {
    public static void main(String[] args) {
        try{
            try {
                args = new String[1];
            args[0] = "10";
            System.out.println("Index: "+args[1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("==ArrayIndexOutOfBoundsException==");
            }
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println("==ArithmeticException==");
        }
    }
}
