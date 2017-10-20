package shamim.wrapper;

public class Wrapper {
    public static void main(String[] args) {
        String x = new String("Shamim");
        String x2 = new String("Shamim");
        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(x2));
        int y1 = 10;
        int y2 = 10;
        System.out.println(System.identityHashCode(y1));
        System.out.println(System.identityHashCode(y2));
}
}