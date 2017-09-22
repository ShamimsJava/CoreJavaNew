
package bd.sum.for_loop;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Forsum forsum = new Forsum();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for startNumber");
        forsum.setStartNumber(sc.nextInt());
        System.out.println("Enter value for endNumber");
        forsum.setEndNumber(sc.nextInt());
        System.out.println(forsum.getSumResult(forsum.getStartNumber(), forsum.getEndNumber()));
    }
}
