package bd.homework;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Balance balance = new Balance();
        System.out.println("Old balance is: " + balance.getBalance());
        System.out.print("Please Enter Cash In: ");
        balance.setCashIn(sc.nextDouble());
        System.out.print("Please Enter Cash Out: ");
        balance.setCashOut(sc.nextDouble());
        balance.balance = balance.getBalance() + balance.getCashIn() - balance.getCashOut();
        System.out.println("New Balance is: " + balance.balance);
    }
}
