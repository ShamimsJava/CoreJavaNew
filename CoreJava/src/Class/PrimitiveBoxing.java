package Class;

public class PrimitiveBoxing {

    public static void main(String[] args) {
        int pInt = 420;
        Integer wInt = new Integer(pInt); // this is called boxing
        int p2 = wInt.intValue(); // this is called unboxing

        System.out.println(pInt);
        System.out.println(wInt);
        System.out.println(p2);
    }

}
