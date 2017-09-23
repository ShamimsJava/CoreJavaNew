package cls.forLoop;

public class SimpleForLoop {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=10; i++){
            System.out.println("The num is: "+i);
            sum += i;
        }
        System.out.println("-----------------");
        System.out.println("The sum is: "+sum);
    }
}
