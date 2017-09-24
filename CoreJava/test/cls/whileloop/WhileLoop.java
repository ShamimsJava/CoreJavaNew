package cls.whileloop;

public class WhileLoop {
    private static int x = 1;
    private static int y = 10;
    private static int sum = 0;
    public static int makeSum(int x, int y){
        while(x<=y){
            sum += x;
            x++;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println("The sum is: "+makeSum(x,y));
    }
}
