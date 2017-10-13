package shihab.example9;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamExample {

    public static void main(String[] args) {
        FileInputStream in = null;
        try {
             in = new FileInputStream("D:/input.txt");
            int c;

            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
            System.out.println("\n");
            
        } catch (IOException e) {
            System.err.println("Could not read file.");
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println("Could close input stream.");
                }
            }
        }
    }
}
