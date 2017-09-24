package cls.forin;

public class ForInForBigNumber {
    static int[] nums = {4,8,5,7,6};
    static int bigNumber = 0;
    
    public static void main(String[] args) {
        for(int i : nums){
            System.out.println(i);
            if(i>bigNumber){
                bigNumber = i;
            }
        }
        System.out.println("Big number is: "+bigNumber);
    }
}
