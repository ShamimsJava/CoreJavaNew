package shihab.example5;

import java.io.*;

public class Simplify5 {
    public static void main(String[] args) throws IOException{
        File oldFile = new File("D:/shamim/old.txt");
        File newFile = new File("D:/shamim/new.txt");
        oldFile.createNewFile();
        oldFile.renameTo(newFile);
    }
}
