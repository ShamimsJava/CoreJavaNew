package shihab.example14;

import java.io.*;

public class Simplify14 {

    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("D:/shamim/shamim.data"));

        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readUTF());
    }
}
