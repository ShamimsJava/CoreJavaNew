package shihab.example12;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {
    public static void main(String[] args) {
        Writer writer =  null;
        String text = "Hello, bangladehs. You are Shamim";
        
        try {
            writer = new FileWriter("D:/shamim/output2.txt");
            writer.write(text);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
