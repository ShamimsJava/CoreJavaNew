package bd.shamim.autoboxing;

public class Autoboxing {

    public static void main(String[] args) {
        int pInt = 420;
        Integer wInt = pInt; // this is called autoboxing
        int p2 = wInt; // this is called autounboxing

        System.out.println(pInt);
        System.out.println(wInt);
        System.out.println(p2);
    }
}
