package shamim.evidence;

public class PrimeNumber {
    public void checkPrime(int x){
        int m = 0;
        for(int i=1; i<=x;i++){
            if(x%i==0){
                m++;
            }
        }
        if(m==2){
            System.err.println(x+" is prime.");
        }else{
            System.err.println(x+" is not prime.");
        }
    }
}
