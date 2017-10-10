package shamim.date9;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is standard input
        Method md = new Method();
        System.out.println("How much price of this book: ");
        md.getPrice(sc.nextDouble());
    }
}
