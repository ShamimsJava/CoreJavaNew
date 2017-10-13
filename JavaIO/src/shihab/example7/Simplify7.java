package shihab.example7;

import java.io.*;

public class Simplify7 {
    public static void main(String[] args) throws IOException{
        File file = new File("D:/shamim/");
        
        for(File f : file.listFiles()){
            System.out.println(f.getPath());
        }
    }
}
