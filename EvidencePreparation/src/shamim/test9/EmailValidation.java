package shamim.test9;

import java.util.Scanner;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Email: ");
        String email = sc.nextLine();
        int atpos = email.indexOf("@");
        int dotpos = email.indexOf(".");
        
        if(atpos > 1 && (dotpos - atpos) > 2){
            System.out.println("Email is valid.");
        }else{
            System.out.println("Email is invalid.");
        }
    }
}
