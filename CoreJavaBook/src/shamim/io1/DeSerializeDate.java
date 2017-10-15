package shamim.io1;

import java.io.*;
import java.util.Date;

public class DeSerializeDate {

    public DeSerializeDate() {
        Date d = null;
        try {
            FileInputStream f = new FileInputStream("D:/shamim/date.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            d = (Date)s.readObject();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Deserialized Date object from date.ser");
        System.out.println("Date: "+d);
    }
    public static void main(String[] args) {
        new DeSerializeDate();
    }
}
