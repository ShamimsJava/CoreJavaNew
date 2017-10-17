package ExceptionHandling;

import java.util.Random;

public class FinallyDemo {
    public static void main(String[] args) {
        int a = 10;
        int b;
        int result;
        
        Random r = new Random();
        
        if(r.nextBoolean()){
            b = 0;
        }else{
            b = 2;
        }
        
        try {
            result = a/b;
            System.out.println("Try block executes: no exception is occured.");
        } catch (Exception e) {
            System.out.println("Catch block excecutes: exception is occured.");
        }finally{
            System.out.println("Finally block always executes");
        }
    }
}
