package cls.forLoop;

public class SimpleForLoopSir {
    private static int x = 1;
    private static int y = 10;
    private static int sum;
    public static int getSum(int s, int e){
        for(int i = s; i <= e; i++){
            sum +=i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println("The sum is: "+getSum(x,y));
    }
}
