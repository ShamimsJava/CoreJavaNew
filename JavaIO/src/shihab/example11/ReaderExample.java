package shihab.example11;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {
    public static void main(String[] args) {
        Reader reader = null;
        
        try {
            reader = new FileReader("D:/shamim/input.txt");
            int c;
            while((c = reader.read()) != -1){
                char ch = (char)c;
                System.out.print(ch);
            }
            System.out.println("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if(reader != null){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
