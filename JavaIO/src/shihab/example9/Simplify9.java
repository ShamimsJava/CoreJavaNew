package shihab.example9;

import java.io.*;

public class Simplify9 {
    public static void main(String[] args) throws IOException{
        FileInputStream in = new FileInputStream("D:/shamim/files.txt");
        int c;
        while((c = in.read()) != -1){
            System.out.print((char)c);
        }
        System.out.println("\n");
        in.close();
    }
}
