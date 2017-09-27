package cls.Exception;

public class InstanceOf {

    public static void main(String[] args) {
        Integer x = 10;
        if (x instanceof Integer) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
