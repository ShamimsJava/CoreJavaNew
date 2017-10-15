package shamim.io1;

import java.io.*;
import java.util.Date;

public class SerializeDate {

    public SerializeDate() {
        Date d = new Date();
        try {
            FileOutputStream f = new FileOutputStream("D:/shamim/date.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(d);
            s.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new SerializeDate();
    }
}
