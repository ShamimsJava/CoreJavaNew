package shamim.FileAndFileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("D:/myfile2.txt");
        
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String s;
            try {
                s = in.readLine();
                while (s != null){
                    System.out.println("Read: "+s);
                    s = in.readLine();
                }
            } finally{
                in.close();
            }
        } catch(FileNotFoundException e1){
            System.out.println("File not fount: "+file);
        }catch(IOException e2){
            e2.printStackTrace();
        }
    }
}
