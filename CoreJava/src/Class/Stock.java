package Class;

import java.util.Date;

public class Stock {
   String symbol;
   double price;
   Date date;

    public Stock() {
    }
   
   
    public static void main(String[] args) {
        Stock sk = new Stock();
        sk.symbol = "Shamim";
        sk.price = 50000;
        sk.date = new Date();
        
        System.out.println("Your name is: "+sk.symbol+" and the product price is: "+sk.price+" Date is: "+sk.date);
    }
}
