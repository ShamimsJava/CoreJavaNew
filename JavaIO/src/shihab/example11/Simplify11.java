package shihab.example11;

import java.io.*;

public class Simplify11 {
    public static void main(String[] args) throws IOException{
         Reader reader = new FileReader("D:/shamim/shihab.txt");
         int c;
         while((c = reader.read()) != -1){
             System.out.print((char)c);
         }
         System.out.println("\n");
         reader.close();
    }
}
