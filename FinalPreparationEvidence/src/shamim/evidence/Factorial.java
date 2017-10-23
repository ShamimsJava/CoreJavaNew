package shamim.evidence;

public class Factorial {
    public void findFactorial(int x){
        int fact = 1;
        for (int i = 1; i <= x ; i++) {
            fact *= i;
        }
        System.err.println("The factorial of "+x+" is : "+fact);
    }
}
