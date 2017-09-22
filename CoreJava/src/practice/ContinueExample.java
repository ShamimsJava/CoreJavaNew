package practice;

public class ContinueExample {
    public static void main(String[] args){
        for(int i = 1; i<=10; i++){
            if(i==5){
                continue;
            }
            System.out.println("The number is: "+i);
        }
        
        System.out.println("++++++++++++++++++++++++++++++++++");
        for(int a = 1; a<=3; a++){
            for(int b = 1; b<=3; b++){
                if(a==2 && b==2){
                    continue;
                }
            System.out.println(a+" "+b);
            }
        }
    }
}