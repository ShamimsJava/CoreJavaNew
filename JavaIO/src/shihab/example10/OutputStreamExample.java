package shihab.example10;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {
    public static void main(String[] args) {
        String destFile = "D:/shamim/output.txt";
        String data = "I am Shamim Shamim Sarker."+
                " My country is Bangladesh. "+
                "Bangladesh is small country.";
        
        try {
            FileOutputStream fos = new FileOutputStream(destFile);
            fos.write(data.getBytes());
            fos.flush();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
