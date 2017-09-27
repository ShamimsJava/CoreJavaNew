package shamim.lecture15;

import java.util.Date;

public class ToString {
    public static void main(String[] args) {
        int x = 10;
        Date now = new Date();
        
        System.out.println("The value of x: "+ x);
        // equivalent
        System.out.println("The value of x: " + Integer.toString(x));
        
        System.out.println("Present date and time: " + now);
        // equivalent
        System.out.println("Present date and time: " + now.toString());
        
    }
    
}
