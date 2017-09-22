
import java.util.Scanner;


public class Shamim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the net weight: ");
        float weight = sc.nextFloat();
        System.out.print("Enter the price: ");
        float price = sc.nextFloat();
        float result = (price*1000)/weight;
        System.out.println("Price per kilogram is: "+result);
    }
}
