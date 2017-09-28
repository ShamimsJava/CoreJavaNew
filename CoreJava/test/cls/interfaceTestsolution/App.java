package cls.interfaceTestsolution;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Account ac = new Account();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your deposite amount: ");
        ac.deposit(sc.nextDouble());
        System.out.println("Please input your withdrawn amount: ");
        ac.withdraw(sc.nextDouble());
        System.out.println("-------------Final output------------");
        ac.checkbalance();
        System.out.println("---------Thank for banking with us--------");
    }
}
