package practice;

public class IfExample {

    final strictfp public static void main(String[] args) {
        int a = 20;
        
        // if statement
        if (a > 18) {
            System.out.println("You are greater than 18.");
        }

        // if else statement 
        if (a > 20) {
            System.out.println("Your are greater than 20.");
        } else {
            System.out.println("Your are less than or equal 20.");
        }
        
        // if else if ladder statement
        if(a<20){
            System.out.println("Your are less than 20.");
        }else if(a==20){
            System.out.println("Your are equal to 20.");
        }else{
            System.out.println("You are greater than 20.");
        }
    }
}