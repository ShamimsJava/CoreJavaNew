package shihab.example10;

import java.io.*;

public class Simplify10 {
    public static void main(String[] args) throws IOException{
        String data = "Bangladesh";
        FileOutputStream fos = new  FileOutputStream("D:/shamim/shihab.txt");
        fos.write(data.getBytes());
        fos.flush();
        fos.close();
    }
}
