package shamim.lecture3;

import java.util.Date; // importing java.util package and Date class

public class App {

    public static void main(String[] args) {
        Stock st = new Stock("Core-Java");
        Date date = new Date(); // this date object can return current date and time
        st.updatePrice(date, 500.0);

        System.out.println("Product name: " + st.getSymbol() + "\n"
                + "Product price: " + st.getPrice() + "\n"
                + "Pursing Date: " + st.getDate());
    }
}
