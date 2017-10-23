package shamim.evidence;

import java.io.IOException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Factorial f = new Factorial();
        PrimeNumber p = new PrimeNumber();
        OddEven o = new OddEven();
        IOExample i = new IOExample();

        while (true) {
            System.out.println("*******************************");
            System.out.println("1.  for finding Factorial");
            System.out.println("2.  for checking prime number.");
            System.out.println("3.  for checking odd even.");
            System.out.println("4.  for java IO.");
            System.out.println("*******************************");
            int x = sc.nextInt();
            switch (x) {
                case 1: {
                    System.out.println("Enter a number for finding factorial: ");
                    f.findFactorial(sc.nextInt());
                    break;
                }
                case 2: {
                    System.out.println("Enter a number for checking prime number: ");
                    p.checkPrime(sc.nextInt());
                    break;
                }
                case 3: {
                    System.out.println("Enter a number for checking odd or even: ");
                    o.checkingOddEven(sc.nextInt());
                    break;
                }
                case 4:{
                    System.out.println("File is created and write in D:/shamim/shamim.txt location.");
                    i.ioexample();
                    break;
                }
                default: {
                    System.out.println("Sorry you press wrong keyword.");
                    System.out.println("\n");
                }
            }
        }
    }
}
