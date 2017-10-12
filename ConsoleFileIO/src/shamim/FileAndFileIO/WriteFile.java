package shamim.FileAndFileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class WriteFile {
    public static void main(String[] args) {
        File file = new File("D:/myfile2.txt");
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(isr);
            PrintWriter out = new PrintWriter(new FileWriter(file));
            String s;
            System.out.println("Enter file text. ");
            System.out.println("Ctrl+z --> Enter to stop.");
            
            while((s = in.readLine()) != null){
                out.println(s);
            }
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// This program should run in cmd
