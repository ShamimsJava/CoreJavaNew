package shamim.lecture3; // package statement

import java.util.Date; // import statement for importing without java.lang package. java.lang package is default

public class Stock {

    // field declaration
    String symbol;
    double price;
    Date date;

    // constructor declaration
    Stock(String stockSymbol) {
        symbol = stockSymbol;
    }

    // method declaration
    void updatePrice(Date updateTime, double newPrice) {
        date = updateTime;
        price = newPrice;
    }

    // declaration of getter method
    String getSymbol() {
        return symbol;
    }

    double getPrice() {
        return price;
    }

    Date getDate() {
        return date;
    }

}
