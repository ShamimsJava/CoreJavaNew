package shamim.lecture15;

public class TestEquals {
    public static void main(String[] args) {
        MyDate d1 = new MyDate(27,9,2017);
        MyDate d2 = new MyDate(27,9,2017);
        
        if(d1 == d2){
            System.out.println("They are equal.");
        }else{
            System.out.println("They are not equal.");
        }
        
        if(d1.equals(d2)){
            System.out.println("They are equal.");
        }else{
            System.out.println("They are not equal.");
        }
        
        d1 = d2;
        if(d1 == d2){
            System.out.println("They are equal.");
        }else{
            System.out.println("They are not equal.");
        }
        
        if(d1.equals(d2)){
            System.out.println("They are equal.");
        }else{
            System.out.println("They are not equal.");
        }
    }
}
