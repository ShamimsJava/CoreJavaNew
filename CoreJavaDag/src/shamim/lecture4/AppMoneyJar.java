package shamim.lecture4;

import java.util.Scanner;

public class AppMoneyJar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MoneyJar mj = new MoneyJar();
        
        System.out.println("What is your purpose for savings: ");
        mj.purpose = sc.nextLine();
        
        System.out.println("How much amount you save? ");
        double m=mj.amount = sc.nextInt();
        
        System.out.println("What is your target amount?");
        mj.setTarget(sc.nextDouble());  // method invocation statement
        
        System.out.println("How much you want to take out? ");
        double p = mj.takeOut(sc.nextDouble());
        
        System.out.println("\n"+"The purpose of savings: "+mj.purpose);
        System.out.println("You save: "+m);
        System.out.println("My target amount is: "+ mj.getTarget());
        System.out.println("My take out amount is: "+ p);
        System.out.println("Now my balance is: "+mj.amount);
        System.out.println("Now my surplus is: "+ mj.getSurplus()+"\n");
    }
    
}
