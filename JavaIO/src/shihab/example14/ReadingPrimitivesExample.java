package shihab.example14;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingPrimitivesExample {
    public static void main(String[] args) {
        String sourceFile = "D:/shamim/primitives.data";
        
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));
            int intValue = dis.readInt();
            double doubleValue = dis.readDouble();
            boolean booleanValue = dis.readBoolean();
            long longValue = dis.readLong();
            
            System.out.println(intValue);
            System.out.println(doubleValue);
            System.out.println(booleanValue);
            System.out.println(longValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
