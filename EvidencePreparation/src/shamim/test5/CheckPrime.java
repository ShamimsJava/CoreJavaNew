package shamim.test5;

public class CheckPrime {
    public static void checkPrime(int n){
        int i, m = 0, flag = 0;
        m = n/2;
        if(n==0||n==1){
            System.out.println("Number is not prime");
            flag =1;
        }else{
            for(i=2; i<=m; i++){
                if(n%i==0){
                    System.out.println("Number is not prime");
                    flag = 1;
                    break;
                }
            }
        }
        if(flag==0){
            System.out.println("Number is prime");
        }
    }
    public static void main(String[] args) {
        checkPrime(2);
    }
}

